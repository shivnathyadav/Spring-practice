package springdemo.rest;

import java.util.ArrayList;
import java.util.List;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import springdemo.entity.Student;

import javax.annotation.PostConstruct;

@RestController
@RequestMapping("/api")
public class StudentRestController {


	private List<Student> theStudents;


	// define @PostConstruct to load the student data ... only once!

	@PostConstruct
	public void loadData() {

		theStudents = new ArrayList<>();

		theStudents.add(new Student("Shiva", "ji"));
		theStudents.add(new Student("Sahith", "Banda"));
		theStudents.add(new Student("Itachi", "Uchhiha"));

	}



	// define endpoint for "/students" - return list of students

	@GetMapping("/students")
	public List<Student> getStudents() {

		return theStudents;
	}

	// define endpoint for "/students/{studentId}" - return student at index

	@GetMapping("/students/{studentId}")
	public Student getStudent(@PathVariable int studentId) {

		// just index into the list ... keep it simple for now

		return theStudents.get(studentId);

	}
//
//	//add the exception handler to return student response
//
//	@ExceptionHandler
//	public ResponseEntity<StudentErrorResponse> handleException(StudentNotFoundException exc) {
//
//		StudentErrorResponse error = new StudentErrorResponse();
//
//		error.setStatus(HttpStatus.NOT_FOUND.value());
//		error.setMessage(exc.getMessage());
//		error.setTimeStamp(System.currentTimeMillis());
//
//		return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
//	}
//
//	//exception handle for bad request like string
//	@ExceptionHandler
//	public ResponseEntity<StudentErrorResponse> handleException(Exception exc) {
//
//		StudentErrorResponse error = new StudentErrorResponse();
//
//		error.setStatus(HttpStatus.BAD_REQUEST.value());
//		error.setMessage(exc.getMessage());
//		error.setTimeStamp(System.currentTimeMillis());
//
//		return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
//	}

}









