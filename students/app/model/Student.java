package model;

import javax.persistence.Entity;
import javax.persistence.Id;
import play.data.validation.Constraints.Required;
import play.db.ebean.Model;

@Entity
public class Student extends Model {

//	/**
//	 * 
//	 */
//
//	private static final long serialVersionUID = 1L;
	@Id
	public int id;
	@Required
	public String name;
	@Required
	public String lastName;

}
