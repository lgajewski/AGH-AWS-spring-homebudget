/*
 * Copyright © 2017 and Confidential to Pegasystems Inc. All rights reserved.
 */
package pl.edu.agh.iosr.aws.user.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Models a {@link Vet Vet's} specialty (for example, dentistry).
 *
 * @author Juergen Hoeller
 */
@Entity
@Table(name = "specialties")
public class Specialty extends NamedEntity implements Serializable {

}
