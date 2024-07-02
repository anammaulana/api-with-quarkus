package org.acme;

import java.util.List;
import java.util.stream.Collectors;

import org.acme.dto.StudentDto;
import org.acme.entity.Student;
import org.acme.repository.StudentRepository;

import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/students")
public class StudentResource {
    @Inject
    StudentRepository studentRepository;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public List<StudentDto> getStudents() {
        List<Student> students = studentRepository.listAll();

        return students.stream()
                .map(item -> new StudentDto(item.getName(), item.getMajor()))
                .collect(Collectors.toList());
    }
}
