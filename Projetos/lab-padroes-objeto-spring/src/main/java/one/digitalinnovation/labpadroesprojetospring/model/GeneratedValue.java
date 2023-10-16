package one.digitalinnovation.labpadroesprojetospring.model;

import javax.persistence.GenerationType;

public @interface GeneratedValue {

    GenerationType strategy();

}
