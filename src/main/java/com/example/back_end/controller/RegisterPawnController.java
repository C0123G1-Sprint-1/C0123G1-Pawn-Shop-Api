package com.example.back_end.controller;

import com.example.back_end.dto.RegisterDTO;
import com.example.back_end.model.ProductType;
import com.example.back_end.model.RegisterPawn;
import com.example.back_end.service.IProductTypeService;
import com.example.back_end.service.IRegisterPawnService;
import com.sun.istack.Nullable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.NonNull;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by: ThangND
 * Date created: 13/07/2023
 * Function: register pawn
 *
 * @param: registerDTO
 * @return
 */

@RestController
@RequestMapping("/api/register")
@CrossOrigin("*")
public class RegisterPawnController {
    @Autowired
    private IRegisterPawnService iRegisterPawnService;

    @Autowired
    private IProductTypeService productTypeService;
    @NonNull
    @PostMapping("/create")
    @PreAuthorize("hasAnyRole('ROLE_ADMIN', 'ROLE_EMPLOYEE')")
    public ResponseEntity<Map<String, String>> createRegisterPawn(
            @Validated @RequestBody RegisterDTO registerDTO, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            Map<String, String> list = new HashMap<>();

            String[] fieldsToCheck = {"name", "phone", "address", "email", "contentNote"};

            for (String field : fieldsToCheck) {
                @Nullable
                FieldError fieldError = bindingResult.getFieldError(field);
                if (fieldError != null) {
                    list.put(field, fieldError.getDefaultMessage());
                }
            }
            return new ResponseEntity<>(list, HttpStatus.BAD_REQUEST);
        }

        Map<String, String> statusCreate = new HashMap<>();
        statusCreate.put("status", "Đăng Ký Cầm Đồ Thành Công ");
        iRegisterPawnService.createRegisterPawn(registerDTO);
        return new ResponseEntity<>(statusCreate, HttpStatus.OK);
    }


//    @GetMapping("/product-type")
//    public ResponseEntity<List<ProductType>> getList() {
//        if (productTypeService.getAll() == null) {
//            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//        }
//        return new ResponseEntity<>(productTypeService.getAll(), HttpStatus.OK);
//    }

    @PatchMapping("/{id}")
    @PreAuthorize("hasAnyRole('ROLE_ADMIN', 'ROLE_EMPLOYEE')")
    public <T> ResponseEntity<T> confirmRegister(@PathVariable("id") Long id) {
        iRegisterPawnService.confirmRegister(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }


    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Map<String, String> handleValidationExceptions(MethodArgumentNotValidException ex) {
        Map<String, String> errors = new HashMap<>();
        ex.getBindingResult().getAllErrors().forEach(error -> {
            String fieldName = ((FieldError) error).getField();
            String errorMessage = error.getDefaultMessage();
            errors.put(fieldName, errorMessage);
        });
        return errors;
    }

    /**
     * Create by: ThangND,
     * Date create : 18/07/2023
     * Function : checkEmailExistence
     *
     * @return boolean This function checks if the email exists in the database.
     * If the email is present in the database, it will return true;
     * otherwise, it will return false.
     * @param email
     */
    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/check-email/{email}")
    public ResponseEntity<Boolean> checkEmailExistence(@PathVariable("email") String email) {
        boolean exists =iRegisterPawnService.existsByEmail(email);
        return ResponseEntity.ok(exists);
    }
    /**
     * Create by: ThangND,
     * Date create : 18/07/2023
     * Function : checkEmailExistence
     * @param phone
     */
    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/check-phone/{phone}")
    public ResponseEntity<Boolean> checkPhone(@PathVariable("phone") String phone) {
        boolean exist  =iRegisterPawnService.existsByPhone(phone);
        return ResponseEntity.ok(exist);
    }




    /**
     * Created by: QuocNHA
     * Date created: 13/07/2023
     * Function: register pawn
     *
     * @return
     * @param: registerDTO
     */
    @GetMapping("")
    @PreAuthorize("hasAnyRole('ROLE_ADMIN', 'ROLE_EMPLOYEE')")
    public ResponseEntity<?> findByNameRegisterPawn(
            @PageableDefault(sort = {"id"}, direction = Sort.Direction.DESC, size = 3) Pageable pageable) {
        return new ResponseEntity<>(iRegisterPawnService.findByNameRegisterPawn(pageable), HttpStatus.OK);
    }
    @GetMapping("/list")
    @PreAuthorize("hasAnyRole('ROLE_ADMIN', 'ROLE_EMPLOYEE')")
    public ResponseEntity<?> listRegisterPawn()
    {
        return new ResponseEntity<>(iRegisterPawnService.findAll(), HttpStatus.OK);
    }
}
