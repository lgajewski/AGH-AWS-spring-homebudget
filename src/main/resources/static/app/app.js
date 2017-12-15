const endpoints = {
    "user": {
        "ip": null
    },
    "stats": {
        "ip": null
    }
};

// read url params
params = {};
location.search.replace(/[?&]+([^=&]+)=([^&]*)/gi, function (s, k, v) {params[k] = v});

const dom = new function () {
    const getUserTemplate = function (user) {
        return '<tr>\n' +
            '                                        <td>\n' +
            '                                            <img src="' + user.imgUrl + '" class="user-avatar" alt="">\n' +
            '                                            <a href="?username=' + user.username + '" class="user-link">' + user.username + '</a>\n' +
            '                                        </td>\n' +
            '                                        <td>2017/12/14</td>\n' +
            '                                        <td class="text-center">\n' +
            '                                            <span class="label label-default">Active</span>\n' +
            '                                        </td>\n' +
            '                                        <td>\n' +
            '                                            <a href="#">' + user.username.slice(0, -3) + '@homebudget.pl</a>\n' +
            '                                        </td>\n' +
            '                                        <td style="width: 20%;">\n' +
            '                                            <a href="#" class="table-link">\n' +
            '                                            <span class="fa-stack">\n' +
            '                                                <i class="fa fa-square fa-stack-2x"></i>\n' +
            '                                                <i class="fa fa-search-plus fa-stack-1x fa-inverse"></i>\n' +
            '                                            </span>\n' +
            '                                            </a>\n' +
            '                                            <a href="#" class="table-link">\n' +
            '                                            <span class="fa-stack">\n' +
            '                                                <i class="fa fa-square fa-stack-2x"></i>\n' +
            '                                                <i class="fa fa-pencil fa-stack-1x fa-inverse"></i>\n' +
            '                                            </span>\n' +
            '                                            </a>\n' +
            '                                            <a href="#" class="table-link danger">\n' +
            '                                            <span class="fa-stack">\n' +
            '                                                <i class="fa fa-square fa-stack-2x"></i>\n' +
            '                                                <i class="fa fa-trash-o fa-stack-1x fa-inverse"></i>\n' +
            '                                            </span>\n' +
            '                                            </a>\n' +
            '                                        </td>\n' +
            '                                    </tr>';
    };

    const genUsers = function () {
        $.ajax(endpoints.user.ip + "/users")
            .then(response => {
                let tbody = $("#user-list").append($("tbody"));
                let users = response._embedded.users;
                users.forEach(u => tbody.append($(getUserTemplate(u))));
            });
    };

    const genExpenses = function () {
        console.log("Nothing here..")
    };

    this.generateBody = function () {
        if (params.username) {
            genExpenses();
        } else {
            genUsers();
        }
    };
};

$.when(
    $.ajax("web/service/user/ip"),
    $.ajax("web/service/stats/ip"),
)
    .done(function (userIP, statsIP) {
        endpoints.user.ip = "http://" + userIP[0];
        endpoints.stats.ip = "http://" + statsIP[0];

        dom.generateBody();
    })
    .fail(function () {
        console.error("Error while reading endpoints IP.")
    });

