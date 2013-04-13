package controllers;

import model.Student;
import play.*;
import play.data.Form;
import play.mvc.*;

import views.html.*;
import views.html.helper.form;

public class Application extends Controller {

	public static Result index() {
		return ok(index.render("Your new application is ready."));
	}

	public static Result addStudent() {

		Student student = Form.form(Student.class).bindFromRequest().get();
		student.save();

		return redirect(routes.Application.index());
	}

}
