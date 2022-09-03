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

/** This is an auto generated class representing the Org type in your schema. */
@SuppressWarnings("all")
@ModelConfig(pluralName = "Orgs")
public final class Org implements Model {
  public static final QueryField ID = field("Org", "id");
  public static final QueryField LOGO = field("Org", "Logo");
  public static final QueryField SURVEYOR_NAME = field("Org", "SurveyorName");
  public static final QueryField TAG_LINE = field("Org", "TagLine");
  public static final QueryField FOOTER_LINE = field("Org", "FooterLine");
  public static final QueryField CURRENT_REFERENCE_NUMBER = field("Org", "CurrentReferenceNumber");
  public static final QueryField ORG_ID = field("Org", "OrgId");
  private final @ModelField(targetType="ID", isRequired = true) String id;
  private final @ModelField(targetType="String", isRequired = true) String Logo;
  private final @ModelField(targetType="String", isRequired = true) String SurveyorName;
  private final @ModelField(targetType="String", isRequired = true) String TagLine;
  private final @ModelField(targetType="String", isRequired = true) String FooterLine;
  private final @ModelField(targetType="String", isRequired = true) String CurrentReferenceNumber;
  private final @ModelField(targetType="String", isRequired = true) String OrgId;
  private @ModelField(targetType="AWSDateTime", isReadOnly = true) Temporal.DateTime createdAt;
  private @ModelField(targetType="AWSDateTime", isReadOnly = true) Temporal.DateTime updatedAt;
  public String getId() {
      return id;
  }
  
  public String getLogo() {
      return Logo;
  }
  
  public String getSurveyorName() {
      return SurveyorName;
  }
  
  public String getTagLine() {
      return TagLine;
  }
  
  public String getFooterLine() {
      return FooterLine;
  }
  
  public String getCurrentReferenceNumber() {
      return CurrentReferenceNumber;
  }
  
  public String getOrgId() {
      return OrgId;
  }
  
  public Temporal.DateTime getCreatedAt() {
      return createdAt;
  }
  
  public Temporal.DateTime getUpdatedAt() {
      return updatedAt;
  }
  
  private Org(String id, String Logo, String SurveyorName, String TagLine, String FooterLine, String CurrentReferenceNumber, String OrgId) {
    this.id = id;
    this.Logo = Logo;
    this.SurveyorName = SurveyorName;
    this.TagLine = TagLine;
    this.FooterLine = FooterLine;
    this.CurrentReferenceNumber = CurrentReferenceNumber;
    this.OrgId = OrgId;
  }
  
  @Override
   public boolean equals(Object obj) {
      if (this == obj) {
        return true;
      } else if(obj == null || getClass() != obj.getClass()) {
        return false;
      } else {
      Org org = (Org) obj;
      return ObjectsCompat.equals(getId(), org.getId()) &&
              ObjectsCompat.equals(getLogo(), org.getLogo()) &&
              ObjectsCompat.equals(getSurveyorName(), org.getSurveyorName()) &&
              ObjectsCompat.equals(getTagLine(), org.getTagLine()) &&
              ObjectsCompat.equals(getFooterLine(), org.getFooterLine()) &&
              ObjectsCompat.equals(getCurrentReferenceNumber(), org.getCurrentReferenceNumber()) &&
              ObjectsCompat.equals(getOrgId(), org.getOrgId()) &&
              ObjectsCompat.equals(getCreatedAt(), org.getCreatedAt()) &&
              ObjectsCompat.equals(getUpdatedAt(), org.getUpdatedAt());
      }
  }
  
  @Override
   public int hashCode() {
    return new StringBuilder()
      .append(getId())
      .append(getLogo())
      .append(getSurveyorName())
      .append(getTagLine())
      .append(getFooterLine())
      .append(getCurrentReferenceNumber())
      .append(getOrgId())
      .append(getCreatedAt())
      .append(getUpdatedAt())
      .toString()
      .hashCode();
  }
  
  @Override
   public String toString() {
    return new StringBuilder()
      .append("Org {")
      .append("id=" + String.valueOf(getId()) + ", ")
      .append("Logo=" + String.valueOf(getLogo()) + ", ")
      .append("SurveyorName=" + String.valueOf(getSurveyorName()) + ", ")
      .append("TagLine=" + String.valueOf(getTagLine()) + ", ")
      .append("FooterLine=" + String.valueOf(getFooterLine()) + ", ")
      .append("CurrentReferenceNumber=" + String.valueOf(getCurrentReferenceNumber()) + ", ")
      .append("OrgId=" + String.valueOf(getOrgId()) + ", ")
      .append("createdAt=" + String.valueOf(getCreatedAt()) + ", ")
      .append("updatedAt=" + String.valueOf(getUpdatedAt()))
      .append("}")
      .toString();
  }
  
  public static LogoStep builder() {
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
  public static Org justId(String id) {
    return new Org(
      id,
      null,
      null,
      null,
      null,
      null,
      null
    );
  }
  
  public CopyOfBuilder copyOfBuilder() {
    return new CopyOfBuilder(id,
      Logo,
      SurveyorName,
      TagLine,
      FooterLine,
      CurrentReferenceNumber,
      OrgId);
  }
  public interface LogoStep {
    SurveyorNameStep logo(String logo);
  }
  

  public interface SurveyorNameStep {
    TagLineStep surveyorName(String surveyorName);
  }
  

  public interface TagLineStep {
    FooterLineStep tagLine(String tagLine);
  }
  

  public interface FooterLineStep {
    CurrentReferenceNumberStep footerLine(String footerLine);
  }
  

  public interface CurrentReferenceNumberStep {
    OrgIdStep currentReferenceNumber(String currentReferenceNumber);
  }
  

  public interface OrgIdStep {
    BuildStep orgId(String orgId);
  }
  

  public interface BuildStep {
    Org build();
    BuildStep id(String id);
  }
  

  public static class Builder implements LogoStep, SurveyorNameStep, TagLineStep, FooterLineStep, CurrentReferenceNumberStep, OrgIdStep, BuildStep {
    private String id;
    private String Logo;
    private String SurveyorName;
    private String TagLine;
    private String FooterLine;
    private String CurrentReferenceNumber;
    private String OrgId;
    @Override
     public Org build() {
        String id = this.id != null ? this.id : UUID.randomUUID().toString();
        
        return new Org(
          id,
          Logo,
          SurveyorName,
          TagLine,
          FooterLine,
          CurrentReferenceNumber,
          OrgId);
    }
    
    @Override
     public SurveyorNameStep logo(String logo) {
        Objects.requireNonNull(logo);
        this.Logo = logo;
        return this;
    }
    
    @Override
     public TagLineStep surveyorName(String surveyorName) {
        Objects.requireNonNull(surveyorName);
        this.SurveyorName = surveyorName;
        return this;
    }
    
    @Override
     public FooterLineStep tagLine(String tagLine) {
        Objects.requireNonNull(tagLine);
        this.TagLine = tagLine;
        return this;
    }
    
    @Override
     public CurrentReferenceNumberStep footerLine(String footerLine) {
        Objects.requireNonNull(footerLine);
        this.FooterLine = footerLine;
        return this;
    }
    
    @Override
     public OrgIdStep currentReferenceNumber(String currentReferenceNumber) {
        Objects.requireNonNull(currentReferenceNumber);
        this.CurrentReferenceNumber = currentReferenceNumber;
        return this;
    }
    
    @Override
     public BuildStep orgId(String orgId) {
        Objects.requireNonNull(orgId);
        this.OrgId = orgId;
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
    private CopyOfBuilder(String id, String logo, String surveyorName, String tagLine, String footerLine, String currentReferenceNumber, String orgId) {
      super.id(id);
      super.logo(logo)
        .surveyorName(surveyorName)
        .tagLine(tagLine)
        .footerLine(footerLine)
        .currentReferenceNumber(currentReferenceNumber)
        .orgId(orgId);
    }
    
    @Override
     public CopyOfBuilder logo(String logo) {
      return (CopyOfBuilder) super.logo(logo);
    }
    
    @Override
     public CopyOfBuilder surveyorName(String surveyorName) {
      return (CopyOfBuilder) super.surveyorName(surveyorName);
    }
    
    @Override
     public CopyOfBuilder tagLine(String tagLine) {
      return (CopyOfBuilder) super.tagLine(tagLine);
    }
    
    @Override
     public CopyOfBuilder footerLine(String footerLine) {
      return (CopyOfBuilder) super.footerLine(footerLine);
    }
    
    @Override
     public CopyOfBuilder currentReferenceNumber(String currentReferenceNumber) {
      return (CopyOfBuilder) super.currentReferenceNumber(currentReferenceNumber);
    }
    
    @Override
     public CopyOfBuilder orgId(String orgId) {
      return (CopyOfBuilder) super.orgId(orgId);
    }
  }
  
}
