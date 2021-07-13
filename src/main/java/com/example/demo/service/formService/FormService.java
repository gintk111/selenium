package com.example.demo.service.formService;

import com.example.demo.model.Form;
import com.example.demo.repository.FormRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Primary
public class FormService implements IFormService{
    @Autowired
    FormRepository dao;

    @Override
    public Iterable<Form> findAll() {
        return null;
    }

    @Override
    public Optional<Form> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public Form save(Form form) {
        return dao.save(form);
    }
}
