package com.application.service;

import com.application.model.Student;
import com.application.model.Subject;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;

public class SchoolService {
    List<Student> students;
    List<Subject> subjects;

    public Map<String, List<Student>> getStudentsGroupedMyLastnameFirstLetter(){
        return students.stream().collect(groupingBy(student -> student.getLastname().substring(0, 1)));
    }

    public Set<Student> getStudentsBySubject(Subject subject){
        return subjects.stream().filter(savedSubject -> savedSubject.getId().equals(subject.getId()))
                .map(Subject::getStudents).flatMap(List::stream).collect(Collectors.toSet());
    }
}
