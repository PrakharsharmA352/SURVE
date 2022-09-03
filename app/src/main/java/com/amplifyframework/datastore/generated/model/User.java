package com.amplifyframework.datastore.generated.model;

import com.amplifyframework.core.model.temporal.Temporal;

import java.util.List;
import java.util.UUID;
import java.util.Objects;

import androidx.core.util.ObjectsCompat;

import com.amplifyframework.core.model.Model;
import com.amplifyframework.core.model.annotations.Index;
import com.amplifyframework.core.model.annotations.ModelConfig;
import com.amplifyframework.core.model.annotations.ModelField;
import com.amplifyframework.core.model.query.predicate.QueryField;

import static com.amplifyframework.core.model.query.predicate.QueryField.field;

/** This is an auto generated class representing the User type in your schema. */
@SuppressWarnings("all")
@ModelConfig(pluralName = "Users")
public final class User implements Model {
  public static final QueryField ID = field("User", "id");
  public static final QueryField NAME = field("User", "Name");
  public static final QueryField EMAIL = field("User", "Email");
  public static final QueryField PHONE = field("User", "Phone");
  public static final QueryField PROFILE = field("User", "Profile");
  private final @ModelField(targetType="ID", isRequired = true) String id;
  private final @ModelField(targetType="String", isRequired = true) String Name;
  private final @ModelField(targetType="String", isRequired = true) String Email;
  private final @ModelField(targetType="String", isRequired = true) String Phone;
  private final @ModelField(targetType="String", isRequired = true) String Profile;
  private @ModelField(targetType="AWSDateTime", isReadOnly = true) Temporal.DateTime createdAt;
  private @ModelField(targetType="AWSDateTime", isReadOnly = true) Temporal.DateTime updatedAt;
  public String getId() {
      return id;
  }
  
  public String getName() {
      return Name;
  }
  
  public String getEmail() {
      return Email;
  }
  
  public String getPhone() {
      return Phone;
  }
  
  public String getProfile() {
      return Profile;
  }
  
  public Temporal.DateTime getCreatedAt() {
      return createdAt;
  }
  
  public Temporal.DateTime getUpdatedAt() {
      return updatedAt;
  }
  
  private User(String id, String Name, String Email, String Phone, String Profile) {
    this.id = id;
    this.Name = Name;
    this.Email = Email;
    this.Phone = Phone;
    this.Profile = Profile;
  }
  
  @Override
   public boolean equals(Object obj) {
      if (this == obj) {
        return true;
      } else if(obj == null || getClass() != obj.getClass()) {
        return false;
      } else {
      User user = (User) obj;
      return ObjectsCompat.equals(getId(), user.getId()) &&
              ObjectsCompat.equals(getName(), user.getName()) &&
              ObjectsCompat.equals(getEmail(), user.getEmail()) &&
              ObjectsCompat.equals(getPhone(), user.getPhone()) &&
              ObjectsCompat.equals(getProfile(), user.getProfile()) &&
              ObjectsCompat.equals(getCreatedAt(), user.getCreatedAt()) &&
              ObjectsCompat.equals(getUpdatedAt(), user.getUpdatedAt());
      }
  }
  
  @Override
   public int hashCode() {
    return new StringBuilder()
      .append(getId())
      .append(getName())
      .append(getEmail())
      .append(getPhone())
      .append(getProfile())
      .append(getCreatedAt())
      .append(getUpdatedAt())
      .toString()
      .hashCode();
  }
  
  @Override
   public String toString() {
    return new StringBuilder()
      .append("User {")
      .append("id=" + String.valueOf(getId()) + ", ")
      .append("Name=" + String.valueOf(getName()) + ", ")
      .append("Email=" + String.valueOf(getEmail()) + ", ")
      .append("Phone=" + String.valueOf(getPhone()) + ", ")
      .append("Profile=" + String.valueOf(getProfile()) + ", ")
      .append("createdAt=" + String.valueOf(getCreatedAt()) + ", ")
      .append("updatedAt=" + String.valueOf(getUpdatedAt()))
      .append("}")
      .toString();
  }
  
  public static NameStep builder() {
      return new Builder();
  }
  
  /**
   * WARNING: This method should not be used to build an instance of this object for a CREATE mutation.
   * This is a convenience method to return an instance of the object with only its ID populated
   * to be used in the context of a parameter in a delete mutation or referencing a foreign key
   * in a relationship.
   * @param id the id of the existing item this instance will represent
   * @return an instance of this model with only ID populated
   */
  public static User justId(String id) {
    return new User(
      id,
      null,
      null,
      null,
      null
    );
  }
  
  public CopyOfBuilder copyOfBuilder() {
    return new CopyOfBuilder(id,
      Name,
      Email,
      Phone,
      Profile);
  }
  public interface NameStep {
    EmailStep name(String name);
  }
  

  public interface EmailStep {
    PhoneStep email(String email);
  }
  

  public interface PhoneStep {
    ProfileStep phone(String phone);
  }
  

  public interface ProfileStep {
    BuildStep profile(String profile);
  }
  

  public interface BuildStep {
    User build();
    BuildStep id(String id);
  }
  

  public static class Builder implements NameStep, EmailStep, PhoneStep, ProfileStep, BuildStep {
    private String id;
    private String Name;
    private String Email;
    private String Phone;
    private String Profile;
    @Override
     public User build() {
        String id = this.id != null ? this.id : UUID.randomUUID().toString();
        
        return new User(
          id,
          Name,
          Email,
          Phone,
          Profile);
    }
    
    @Override
     public EmailStep name(String name) {
        Objects.requireNonNull(name);
        this.Name = name;
        return this;
    }
    
    @Override
     public PhoneStep email(String email) {
        Objects.requireNonNull(email);
        this.Email = email;
        return this;
    }
    
    @Override
     public ProfileStep phone(String phone) {
        Objects.requireNonNull(phone);
        this.Phone = phone;
        return this;
    }
    
    @Override
     public BuildStep profile(String profile) {
        Objects.requireNonNull(profile);
        this.Profile = profile;
        return this;
    }
    
    /**
     * @param id id
     * @return Current Builder instance, for fluent method chaining
     */
    public BuildStep id(String id) {
        this.id = id;
        return this;
    }
  }
  

  public final class CopyOfBuilder extends Builder {
    private CopyOfBuilder(String id, String name, String email, String phone, String profile) {
      super.id(id);
      super.name(name)
        .email(email)
        .phone(phone)
        .profile(profile);
    }
    
    @Override
     public CopyOfBuilder name(String name) {
      return (CopyOfBuilder) super.name(name);
    }
    
    @Override
     public CopyOfBuilder email(String email) {
      return (CopyOfBuilder) super.email(email);
    }
    
    @Override
     public CopyOfBuilder phone(String phone) {
      return (CopyOfBuilder) super.phone(phone);
    }
    
    @Override
     public CopyOfBuilder profile(String profile) {
      return (CopyOfBuilder) super.profile(profile);
    }
  }
  
}
