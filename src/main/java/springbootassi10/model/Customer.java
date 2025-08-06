package springbootassi10.model;

import jakarta.validation.constraints.*;
import java.time.LocalDate;

public class Customer {

    @NotBlank(message = "{customer.name.required}")
    @Size(min = 2, max = 30, message = "{customer.name.size}")
    private String name;

    @NotBlank(message = "{customer.email.required}")
    @Email(message = "{customer.email.invalid}")
    private String email;

    @NotNull(message = "{customer.age.required}")
    @Min(value = 18, message = "{customer.age.invalid}")
    @Max(value = 60, message = "{customer.age.invalid}")
    private Integer age;

    @NotBlank(message = "{customer.gender.required}")
    private String gender;

    @NotNull(message = "{customer.birthday.required}")
    private LocalDate birthday;

    @NotBlank(message = "{customer.phone.required}")
    @Pattern(regexp = "\\d{3}-\\d{3}-\\d{4}", message = "{customer.phone.invalid}")
    private String phone;

    // Getters and Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
