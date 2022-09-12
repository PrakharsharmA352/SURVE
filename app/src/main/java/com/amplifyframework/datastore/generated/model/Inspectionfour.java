package com.amplifyframework.datastore.generated.model;

import com.amplifyframework.core.model.temporal.Temporal;

import java.util.List;
import java.util.UUID;
import java.util.Objects;

import androidx.core.util.ObjectsCompat;

import com.amplifyframework.core.model.AuthStrategy;
import com.amplifyframework.core.model.Model;
import com.amplifyframework.core.model.ModelOperation;
import com.amplifyframework.core.model.annotations.AuthRule;
import com.amplifyframework.core.model.annotations.Index;
import com.amplifyframework.core.model.annotations.ModelConfig;
import com.amplifyframework.core.model.annotations.ModelField;
import com.amplifyframework.core.model.query.predicate.QueryField;

import static com.amplifyframework.core.model.query.predicate.QueryField.field;

/** This is an auto generated class representing the Inspectionfour type in your schema. */
@SuppressWarnings("all")
@ModelConfig(pluralName = "Inspectionfours", authRules = {
  @AuthRule(allow = AuthStrategy.PUBLIC, operations = { ModelOperation.CREATE, ModelOperation.UPDATE, ModelOperation.DELETE, ModelOperation.READ })
})
public final class Inspectionfour implements Model {
  public static final QueryField ID = field("Inspectionfour", "id");
  public static final QueryField GENERATED_REPORTS = field("Inspectionfour", "GeneratedReports");
  public static final QueryField INSURER_DETAILS = field("Inspectionfour", "InsurerDetails");
  public static final QueryField NAMEOF_PROPOSER = field("Inspectionfour", "NameofProposer");
  public static final QueryField DATE = field("Inspectionfour", "Date");
  public static final QueryField TIME = field("Inspectionfour", "Time");
  public static final QueryField PLACEOF_INSPECTION = field("Inspectionfour", "PlaceofInspection");
  public static final QueryField VEHICLE_REGD_NO = field("Inspectionfour", "VehicleRegdNo");
  public static final QueryField MAKE_MODEL = field("Inspectionfour", "MakeModel");
  public static final QueryField DATEOF_REGD_PURCHASE = field("Inspectionfour", "DateofRegdPurchase");
  public static final QueryField CHASSIS_NO = field("Inspectionfour", "ChassisNo");
  public static final QueryField ENGINE_NO = field("Inspectionfour", "EngineNo");
  public static final QueryField MILO_METER = field("Inspectionfour", "MiloMeter");
  public static final QueryField ROOF = field("Inspectionfour", "Roof");
  public static final QueryField BONNET = field("Inspectionfour", "Bonnet");
  public static final QueryField LH_FENDER = field("Inspectionfour", "LhFender");
  public static final QueryField LH_FRT_DOOR = field("Inspectionfour", "LhFrtDoor");
  public static final QueryField LH_REAR_DOOR = field("Inspectionfour", "LhRearDoor");
  public static final QueryField LH_QTR_PANEL = field("Inspectionfour", "LhQtrPanel");
  public static final QueryField LH_SIDE_BODY = field("Inspectionfour", "LhSideBody");
  public static final QueryField DICKY = field("Inspectionfour", "Dicky");
  public static final QueryField RH_FENDER = field("Inspectionfour", "RhFender");
  public static final QueryField RH_FRT_DOOR = field("Inspectionfour", "RhFrtDoor");
  public static final QueryField RH_REAR_DOOR = field("Inspectionfour", "RhRearDoor");
  public static final QueryField RH_QTR_PANEL = field("Inspectionfour", "RhQtrPanel");
  public static final QueryField RH_SIDE_BODY = field("Inspectionfour", "RhSideBody");
  public static final QueryField FRONT_BUMPER = field("Inspectionfour", "FrontBumper");
  public static final QueryField REAR_BUMPER = field("Inspectionfour", "RearBumper");
  public static final QueryField FRT_WS_GLASS = field("Inspectionfour", "FrtWSGlass");
  public static final QueryField LH_FRT_DOOR_GLASS = field("Inspectionfour", "LhFrtDoorGlass");
  public static final QueryField LH_REAR_DOOR_GLASS = field("Inspectionfour", "LhRearDoorGlass");
  public static final QueryField RH_FRT_DOOR_GLASS = field("Inspectionfour", "RhFrtDoorGlass");
  public static final QueryField RH_REAR_DOOR_GLASS = field("Inspectionfour", "RhRearDoorGlass");
  public static final QueryField RH_QTR_GLASS = field("Inspectionfour", "RhQtrGlass");
  public static final QueryField LH_QTR_GLASS = field("Inspectionfour", "LhQtrGlass");
  public static final QueryField DICKY_GLASS = field("Inspectionfour", "DickyGlass");
  public static final QueryField HEAD_LAMPS = field("Inspectionfour", "HeadLamps");
  public static final QueryField TAIL_LAMPS = field("Inspectionfour", "TailLamps");
  public static final QueryField TYRE_WHEEL = field("Inspectionfour", "TyreWheel");
  public static final QueryField REAR_VIEW_MIRROR = field("Inspectionfour", "RearViewMirror");
  public static final QueryField DASH_BOARD_I_PANEL = field("Inspectionfour", "DashBoardIPanel");
  public static final QueryField ELE_ACCESSORIES = field("Inspectionfour", "Ele_Accessories");
  public static final QueryField NON_ELE_ACCESSORIES = field("Inspectionfour", "NonEle_Accessories");
  public static final QueryField RECOMMENDED_FOR_INSURANCE = field("Inspectionfour", "RecommendedForInsurance");
  public static final QueryField REMARKS = field("Inspectionfour", "Remarks");
  private final @ModelField(targetType="ID", isRequired = true) String id;
  private final @ModelField(targetType="String", isRequired = true) String GeneratedReports;
  private final @ModelField(targetType="String", isRequired = true) String InsurerDetails;
  private final @ModelField(targetType="String", isRequired = true) String NameofProposer;
  private final @ModelField(targetType="String", isRequired = true) String Date;
  private final @ModelField(targetType="String", isRequired = true) String Time;
  private final @ModelField(targetType="String", isRequired = true) String PlaceofInspection;
  private final @ModelField(targetType="String", isRequired = true) String VehicleRegdNo;
  private final @ModelField(targetType="String", isRequired = true) String MakeModel;
  private final @ModelField(targetType="String", isRequired = true) String DateofRegdPurchase;
  private final @ModelField(targetType="String", isRequired = true) String ChassisNo;
  private final @ModelField(targetType="String", isRequired = true) String EngineNo;
  private final @ModelField(targetType="String", isRequired = true) String MiloMeter;
  private final @ModelField(targetType="String", isRequired = true) String Roof;
  private final @ModelField(targetType="String", isRequired = true) String Bonnet;
  private final @ModelField(targetType="String", isRequired = true) String LhFender;
  private final @ModelField(targetType="String", isRequired = true) String LhFrtDoor;
  private final @ModelField(targetType="String", isRequired = true) String LhRearDoor;
  private final @ModelField(targetType="String", isRequired = true) String LhQtrPanel;
  private final @ModelField(targetType="String", isRequired = true) String LhSideBody;
  private final @ModelField(targetType="String", isRequired = true) String Dicky;
  private final @ModelField(targetType="String", isRequired = true) String RhFender;
  private final @ModelField(targetType="String", isRequired = true) String RhFrtDoor;
  private final @ModelField(targetType="String", isRequired = true) String RhRearDoor;
  private final @ModelField(targetType="String", isRequired = true) String RhQtrPanel;
  private final @ModelField(targetType="String", isRequired = true) String RhSideBody;
  private final @ModelField(targetType="String", isRequired = true) String FrontBumper;
  private final @ModelField(targetType="String", isRequired = true) String RearBumper;
  private final @ModelField(targetType="String", isRequired = true) String FrtWSGlass;
  private final @ModelField(targetType="String", isRequired = true) String LhFrtDoorGlass;
  private final @ModelField(targetType="String", isRequired = true) String LhRearDoorGlass;
  private final @ModelField(targetType="String", isRequired = true) String RhFrtDoorGlass;
  private final @ModelField(targetType="String", isRequired = true) String RhRearDoorGlass;
  private final @ModelField(targetType="String", isRequired = true) String RhQtrGlass;
  private final @ModelField(targetType="String", isRequired = true) String LhQtrGlass;
  private final @ModelField(targetType="String", isRequired = true) String DickyGlass;
  private final @ModelField(targetType="String", isRequired = true) String HeadLamps;
  private final @ModelField(targetType="String", isRequired = true) String TailLamps;
  private final @ModelField(targetType="String", isRequired = true) String TyreWheel;
  private final @ModelField(targetType="String", isRequired = true) String RearViewMirror;
  private final @ModelField(targetType="String", isRequired = true) String DashBoardIPanel;
  private final @ModelField(targetType="String", isRequired = true) String Ele_Accessories;
  private final @ModelField(targetType="String", isRequired = true) String NonEle_Accessories;
  private final @ModelField(targetType="String", isRequired = true) String RecommendedForInsurance;
  private final @ModelField(targetType="String", isRequired = true) String Remarks;
  private @ModelField(targetType="AWSDateTime", isReadOnly = true) Temporal.DateTime createdAt;
  private @ModelField(targetType="AWSDateTime", isReadOnly = true) Temporal.DateTime updatedAt;
  public String getId() {
      return id;
  }
  
  public String getGeneratedReports() {
      return GeneratedReports;
  }
  
  public String getInsurerDetails() {
      return InsurerDetails;
  }
  
  public String getNameofProposer() {
      return NameofProposer;
  }
  
  public String getDate() {
      return Date;
  }
  
  public String getTime() {
      return Time;
  }
  
  public String getPlaceofInspection() {
      return PlaceofInspection;
  }
  
  public String getVehicleRegdNo() {
      return VehicleRegdNo;
  }
  
  public String getMakeModel() {
      return MakeModel;
  }
  
  public String getDateofRegdPurchase() {
      return DateofRegdPurchase;
  }
  
  public String getChassisNo() {
      return ChassisNo;
  }
  
  public String getEngineNo() {
      return EngineNo;
  }
  
  public String getMiloMeter() {
      return MiloMeter;
  }
  
  public String getRoof() {
      return Roof;
  }
  
  public String getBonnet() {
      return Bonnet;
  }
  
  public String getLhFender() {
      return LhFender;
  }
  
  public String getLhFrtDoor() {
      return LhFrtDoor;
  }
  
  public String getLhRearDoor() {
      return LhRearDoor;
  }
  
  public String getLhQtrPanel() {
      return LhQtrPanel;
  }
  
  public String getLhSideBody() {
      return LhSideBody;
  }
  
  public String getDicky() {
      return Dicky;
  }
  
  public String getRhFender() {
      return RhFender;
  }
  
  public String getRhFrtDoor() {
      return RhFrtDoor;
  }
  
  public String getRhRearDoor() {
      return RhRearDoor;
  }
  
  public String getRhQtrPanel() {
      return RhQtrPanel;
  }
  
  public String getRhSideBody() {
      return RhSideBody;
  }
  
  public String getFrontBumper() {
      return FrontBumper;
  }
  
  public String getRearBumper() {
      return RearBumper;
  }
  
  public String getFrtWsGlass() {
      return FrtWSGlass;
  }
  
  public String getLhFrtDoorGlass() {
      return LhFrtDoorGlass;
  }
  
  public String getLhRearDoorGlass() {
      return LhRearDoorGlass;
  }
  
  public String getRhFrtDoorGlass() {
      return RhFrtDoorGlass;
  }
  
  public String getRhRearDoorGlass() {
      return RhRearDoorGlass;
  }
  
  public String getRhQtrGlass() {
      return RhQtrGlass;
  }
  
  public String getLhQtrGlass() {
      return LhQtrGlass;
  }
  
  public String getDickyGlass() {
      return DickyGlass;
  }
  
  public String getHeadLamps() {
      return HeadLamps;
  }
  
  public String getTailLamps() {
      return TailLamps;
  }
  
  public String getTyreWheel() {
      return TyreWheel;
  }
  
  public String getRearViewMirror() {
      return RearViewMirror;
  }
  
  public String getDashBoardIPanel() {
      return DashBoardIPanel;
  }
  
  public String getEleAccessories() {
      return Ele_Accessories;
  }
  
  public String getNonEleAccessories() {
      return NonEle_Accessories;
  }
  
  public String getRecommendedForInsurance() {
      return RecommendedForInsurance;
  }
  
  public String getRemarks() {
      return Remarks;
  }
  
  public Temporal.DateTime getCreatedAt() {
      return createdAt;
  }
  
  public Temporal.DateTime getUpdatedAt() {
      return updatedAt;
  }
  
  private Inspectionfour(String id, String GeneratedReports, String InsurerDetails, String NameofProposer, String Date, String Time, String PlaceofInspection, String VehicleRegdNo, String MakeModel, String DateofRegdPurchase, String ChassisNo, String EngineNo, String MiloMeter, String Roof, String Bonnet, String LhFender, String LhFrtDoor, String LhRearDoor, String LhQtrPanel, String LhSideBody, String Dicky, String RhFender, String RhFrtDoor, String RhRearDoor, String RhQtrPanel, String RhSideBody, String FrontBumper, String RearBumper, String FrtWSGlass, String LhFrtDoorGlass, String LhRearDoorGlass, String RhFrtDoorGlass, String RhRearDoorGlass, String RhQtrGlass, String LhQtrGlass, String DickyGlass, String HeadLamps, String TailLamps, String TyreWheel, String RearViewMirror, String DashBoardIPanel, String Ele_Accessories, String NonEle_Accessories, String RecommendedForInsurance, String Remarks) {
    this.id = id;
    this.GeneratedReports = GeneratedReports;
    this.InsurerDetails = InsurerDetails;
    this.NameofProposer = NameofProposer;
    this.Date = Date;
    this.Time = Time;
    this.PlaceofInspection = PlaceofInspection;
    this.VehicleRegdNo = VehicleRegdNo;
    this.MakeModel = MakeModel;
    this.DateofRegdPurchase = DateofRegdPurchase;
    this.ChassisNo = ChassisNo;
    this.EngineNo = EngineNo;
    this.MiloMeter = MiloMeter;
    this.Roof = Roof;
    this.Bonnet = Bonnet;
    this.LhFender = LhFender;
    this.LhFrtDoor = LhFrtDoor;
    this.LhRearDoor = LhRearDoor;
    this.LhQtrPanel = LhQtrPanel;
    this.LhSideBody = LhSideBody;
    this.Dicky = Dicky;
    this.RhFender = RhFender;
    this.RhFrtDoor = RhFrtDoor;
    this.RhRearDoor = RhRearDoor;
    this.RhQtrPanel = RhQtrPanel;
    this.RhSideBody = RhSideBody;
    this.FrontBumper = FrontBumper;
    this.RearBumper = RearBumper;
    this.FrtWSGlass = FrtWSGlass;
    this.LhFrtDoorGlass = LhFrtDoorGlass;
    this.LhRearDoorGlass = LhRearDoorGlass;
    this.RhFrtDoorGlass = RhFrtDoorGlass;
    this.RhRearDoorGlass = RhRearDoorGlass;
    this.RhQtrGlass = RhQtrGlass;
    this.LhQtrGlass = LhQtrGlass;
    this.DickyGlass = DickyGlass;
    this.HeadLamps = HeadLamps;
    this.TailLamps = TailLamps;
    this.TyreWheel = TyreWheel;
    this.RearViewMirror = RearViewMirror;
    this.DashBoardIPanel = DashBoardIPanel;
    this.Ele_Accessories = Ele_Accessories;
    this.NonEle_Accessories = NonEle_Accessories;
    this.RecommendedForInsurance = RecommendedForInsurance;
    this.Remarks = Remarks;
  }
  
  @Override
   public boolean equals(Object obj) {
      if (this == obj) {
        return true;
      } else if(obj == null || getClass() != obj.getClass()) {
        return false;
      } else {
      Inspectionfour inspectionfour = (Inspectionfour) obj;
      return ObjectsCompat.equals(getId(), inspectionfour.getId()) &&
              ObjectsCompat.equals(getGeneratedReports(), inspectionfour.getGeneratedReports()) &&
              ObjectsCompat.equals(getInsurerDetails(), inspectionfour.getInsurerDetails()) &&
              ObjectsCompat.equals(getNameofProposer(), inspectionfour.getNameofProposer()) &&
              ObjectsCompat.equals(getDate(), inspectionfour.getDate()) &&
              ObjectsCompat.equals(getTime(), inspectionfour.getTime()) &&
              ObjectsCompat.equals(getPlaceofInspection(), inspectionfour.getPlaceofInspection()) &&
              ObjectsCompat.equals(getVehicleRegdNo(), inspectionfour.getVehicleRegdNo()) &&
              ObjectsCompat.equals(getMakeModel(), inspectionfour.getMakeModel()) &&
              ObjectsCompat.equals(getDateofRegdPurchase(), inspectionfour.getDateofRegdPurchase()) &&
              ObjectsCompat.equals(getChassisNo(), inspectionfour.getChassisNo()) &&
              ObjectsCompat.equals(getEngineNo(), inspectionfour.getEngineNo()) &&
              ObjectsCompat.equals(getMiloMeter(), inspectionfour.getMiloMeter()) &&
              ObjectsCompat.equals(getRoof(), inspectionfour.getRoof()) &&
              ObjectsCompat.equals(getBonnet(), inspectionfour.getBonnet()) &&
              ObjectsCompat.equals(getLhFender(), inspectionfour.getLhFender()) &&
              ObjectsCompat.equals(getLhFrtDoor(), inspectionfour.getLhFrtDoor()) &&
              ObjectsCompat.equals(getLhRearDoor(), inspectionfour.getLhRearDoor()) &&
              ObjectsCompat.equals(getLhQtrPanel(), inspectionfour.getLhQtrPanel()) &&
              ObjectsCompat.equals(getLhSideBody(), inspectionfour.getLhSideBody()) &&
              ObjectsCompat.equals(getDicky(), inspectionfour.getDicky()) &&
              ObjectsCompat.equals(getRhFender(), inspectionfour.getRhFender()) &&
              ObjectsCompat.equals(getRhFrtDoor(), inspectionfour.getRhFrtDoor()) &&
              ObjectsCompat.equals(getRhRearDoor(), inspectionfour.getRhRearDoor()) &&
              ObjectsCompat.equals(getRhQtrPanel(), inspectionfour.getRhQtrPanel()) &&
              ObjectsCompat.equals(getRhSideBody(), inspectionfour.getRhSideBody()) &&
              ObjectsCompat.equals(getFrontBumper(), inspectionfour.getFrontBumper()) &&
              ObjectsCompat.equals(getRearBumper(), inspectionfour.getRearBumper()) &&
              ObjectsCompat.equals(getFrtWsGlass(), inspectionfour.getFrtWsGlass()) &&
              ObjectsCompat.equals(getLhFrtDoorGlass(), inspectionfour.getLhFrtDoorGlass()) &&
              ObjectsCompat.equals(getLhRearDoorGlass(), inspectionfour.getLhRearDoorGlass()) &&
              ObjectsCompat.equals(getRhFrtDoorGlass(), inspectionfour.getRhFrtDoorGlass()) &&
              ObjectsCompat.equals(getRhRearDoorGlass(), inspectionfour.getRhRearDoorGlass()) &&
              ObjectsCompat.equals(getRhQtrGlass(), inspectionfour.getRhQtrGlass()) &&
              ObjectsCompat.equals(getLhQtrGlass(), inspectionfour.getLhQtrGlass()) &&
              ObjectsCompat.equals(getDickyGlass(), inspectionfour.getDickyGlass()) &&
              ObjectsCompat.equals(getHeadLamps(), inspectionfour.getHeadLamps()) &&
              ObjectsCompat.equals(getTailLamps(), inspectionfour.getTailLamps()) &&
              ObjectsCompat.equals(getTyreWheel(), inspectionfour.getTyreWheel()) &&
              ObjectsCompat.equals(getRearViewMirror(), inspectionfour.getRearViewMirror()) &&
              ObjectsCompat.equals(getDashBoardIPanel(), inspectionfour.getDashBoardIPanel()) &&
              ObjectsCompat.equals(getEleAccessories(), inspectionfour.getEleAccessories()) &&
              ObjectsCompat.equals(getNonEleAccessories(), inspectionfour.getNonEleAccessories()) &&
              ObjectsCompat.equals(getRecommendedForInsurance(), inspectionfour.getRecommendedForInsurance()) &&
              ObjectsCompat.equals(getRemarks(), inspectionfour.getRemarks()) &&
              ObjectsCompat.equals(getCreatedAt(), inspectionfour.getCreatedAt()) &&
              ObjectsCompat.equals(getUpdatedAt(), inspectionfour.getUpdatedAt());
      }
  }
  
  @Override
   public int hashCode() {
    return new StringBuilder()
      .append(getId())
      .append(getGeneratedReports())
      .append(getInsurerDetails())
      .append(getNameofProposer())
      .append(getDate())
      .append(getTime())
      .append(getPlaceofInspection())
      .append(getVehicleRegdNo())
      .append(getMakeModel())
      .append(getDateofRegdPurchase())
      .append(getChassisNo())
      .append(getEngineNo())
      .append(getMiloMeter())
      .append(getRoof())
      .append(getBonnet())
      .append(getLhFender())
      .append(getLhFrtDoor())
      .append(getLhRearDoor())
      .append(getLhQtrPanel())
      .append(getLhSideBody())
      .append(getDicky())
      .append(getRhFender())
      .append(getRhFrtDoor())
      .append(getRhRearDoor())
      .append(getRhQtrPanel())
      .append(getRhSideBody())
      .append(getFrontBumper())
      .append(getRearBumper())
      .append(getFrtWsGlass())
      .append(getLhFrtDoorGlass())
      .append(getLhRearDoorGlass())
      .append(getRhFrtDoorGlass())
      .append(getRhRearDoorGlass())
      .append(getRhQtrGlass())
      .append(getLhQtrGlass())
      .append(getDickyGlass())
      .append(getHeadLamps())
      .append(getTailLamps())
      .append(getTyreWheel())
      .append(getRearViewMirror())
      .append(getDashBoardIPanel())
      .append(getEleAccessories())
      .append(getNonEleAccessories())
      .append(getRecommendedForInsurance())
      .append(getRemarks())
      .append(getCreatedAt())
      .append(getUpdatedAt())
      .toString()
      .hashCode();
  }
  
  @Override
   public String toString() {
    return new StringBuilder()
      .append("Inspectionfour {")
      .append("id=" + String.valueOf(getId()) + ", ")
      .append("GeneratedReports=" + String.valueOf(getGeneratedReports()) + ", ")
      .append("InsurerDetails=" + String.valueOf(getInsurerDetails()) + ", ")
      .append("NameofProposer=" + String.valueOf(getNameofProposer()) + ", ")
      .append("Date=" + String.valueOf(getDate()) + ", ")
      .append("Time=" + String.valueOf(getTime()) + ", ")
      .append("PlaceofInspection=" + String.valueOf(getPlaceofInspection()) + ", ")
      .append("VehicleRegdNo=" + String.valueOf(getVehicleRegdNo()) + ", ")
      .append("MakeModel=" + String.valueOf(getMakeModel()) + ", ")
      .append("DateofRegdPurchase=" + String.valueOf(getDateofRegdPurchase()) + ", ")
      .append("ChassisNo=" + String.valueOf(getChassisNo()) + ", ")
      .append("EngineNo=" + String.valueOf(getEngineNo()) + ", ")
      .append("MiloMeter=" + String.valueOf(getMiloMeter()) + ", ")
      .append("Roof=" + String.valueOf(getRoof()) + ", ")
      .append("Bonnet=" + String.valueOf(getBonnet()) + ", ")
      .append("LhFender=" + String.valueOf(getLhFender()) + ", ")
      .append("LhFrtDoor=" + String.valueOf(getLhFrtDoor()) + ", ")
      .append("LhRearDoor=" + String.valueOf(getLhRearDoor()) + ", ")
      .append("LhQtrPanel=" + String.valueOf(getLhQtrPanel()) + ", ")
      .append("LhSideBody=" + String.valueOf(getLhSideBody()) + ", ")
      .append("Dicky=" + String.valueOf(getDicky()) + ", ")
      .append("RhFender=" + String.valueOf(getRhFender()) + ", ")
      .append("RhFrtDoor=" + String.valueOf(getRhFrtDoor()) + ", ")
      .append("RhRearDoor=" + String.valueOf(getRhRearDoor()) + ", ")
      .append("RhQtrPanel=" + String.valueOf(getRhQtrPanel()) + ", ")
      .append("RhSideBody=" + String.valueOf(getRhSideBody()) + ", ")
      .append("FrontBumper=" + String.valueOf(getFrontBumper()) + ", ")
      .append("RearBumper=" + String.valueOf(getRearBumper()) + ", ")
      .append("FrtWSGlass=" + String.valueOf(getFrtWsGlass()) + ", ")
      .append("LhFrtDoorGlass=" + String.valueOf(getLhFrtDoorGlass()) + ", ")
      .append("LhRearDoorGlass=" + String.valueOf(getLhRearDoorGlass()) + ", ")
      .append("RhFrtDoorGlass=" + String.valueOf(getRhFrtDoorGlass()) + ", ")
      .append("RhRearDoorGlass=" + String.valueOf(getRhRearDoorGlass()) + ", ")
      .append("RhQtrGlass=" + String.valueOf(getRhQtrGlass()) + ", ")
      .append("LhQtrGlass=" + String.valueOf(getLhQtrGlass()) + ", ")
      .append("DickyGlass=" + String.valueOf(getDickyGlass()) + ", ")
      .append("HeadLamps=" + String.valueOf(getHeadLamps()) + ", ")
      .append("TailLamps=" + String.valueOf(getTailLamps()) + ", ")
      .append("TyreWheel=" + String.valueOf(getTyreWheel()) + ", ")
      .append("RearViewMirror=" + String.valueOf(getRearViewMirror()) + ", ")
      .append("DashBoardIPanel=" + String.valueOf(getDashBoardIPanel()) + ", ")
      .append("Ele_Accessories=" + String.valueOf(getEleAccessories()) + ", ")
      .append("NonEle_Accessories=" + String.valueOf(getNonEleAccessories()) + ", ")
      .append("RecommendedForInsurance=" + String.valueOf(getRecommendedForInsurance()) + ", ")
      .append("Remarks=" + String.valueOf(getRemarks()) + ", ")
      .append("createdAt=" + String.valueOf(getCreatedAt()) + ", ")
      .append("updatedAt=" + String.valueOf(getUpdatedAt()))
      .append("}")
      .toString();
  }
  
  public static GeneratedReportsStep builder() {
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
  public static Inspectionfour justId(String id) {
    return new Inspectionfour(
      id,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
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
      GeneratedReports,
      InsurerDetails,
      NameofProposer,
      Date,
      Time,
      PlaceofInspection,
      VehicleRegdNo,
      MakeModel,
      DateofRegdPurchase,
      ChassisNo,
      EngineNo,
      MiloMeter,
      Roof,
      Bonnet,
      LhFender,
      LhFrtDoor,
      LhRearDoor,
      LhQtrPanel,
      LhSideBody,
      Dicky,
      RhFender,
      RhFrtDoor,
      RhRearDoor,
      RhQtrPanel,
      RhSideBody,
      FrontBumper,
      RearBumper,
      FrtWSGlass,
      LhFrtDoorGlass,
      LhRearDoorGlass,
      RhFrtDoorGlass,
      RhRearDoorGlass,
      RhQtrGlass,
      LhQtrGlass,
      DickyGlass,
      HeadLamps,
      TailLamps,
      TyreWheel,
      RearViewMirror,
      DashBoardIPanel,
      Ele_Accessories,
      NonEle_Accessories,
      RecommendedForInsurance,
      Remarks);
  }
  public interface GeneratedReportsStep {
    InsurerDetailsStep generatedReports(String generatedReports);
  }
  

  public interface InsurerDetailsStep {
    NameofProposerStep insurerDetails(String insurerDetails);
  }
  

  public interface NameofProposerStep {
    DateStep nameofProposer(String nameofProposer);
  }
  

  public interface DateStep {
    TimeStep date(String date);
  }
  

  public interface TimeStep {
    PlaceofInspectionStep time(String time);
  }
  

  public interface PlaceofInspectionStep {
    VehicleRegdNoStep placeofInspection(String placeofInspection);
  }
  

  public interface VehicleRegdNoStep {
    MakeModelStep vehicleRegdNo(String vehicleRegdNo);
  }
  

  public interface MakeModelStep {
    DateofRegdPurchaseStep makeModel(String makeModel);
  }
  

  public interface DateofRegdPurchaseStep {
    ChassisNoStep dateofRegdPurchase(String dateofRegdPurchase);
  }
  

  public interface ChassisNoStep {
    EngineNoStep chassisNo(String chassisNo);
  }
  

  public interface EngineNoStep {
    MiloMeterStep engineNo(String engineNo);
  }
  

  public interface MiloMeterStep {
    RoofStep miloMeter(String miloMeter);
  }
  

  public interface RoofStep {
    BonnetStep roof(String roof);
  }
  

  public interface BonnetStep {
    LhFenderStep bonnet(String bonnet);
  }
  

  public interface LhFenderStep {
    LhFrtDoorStep lhFender(String lhFender);
  }
  

  public interface LhFrtDoorStep {
    LhRearDoorStep lhFrtDoor(String lhFrtDoor);
  }
  

  public interface LhRearDoorStep {
    LhQtrPanelStep lhRearDoor(String lhRearDoor);
  }
  

  public interface LhQtrPanelStep {
    LhSideBodyStep lhQtrPanel(String lhQtrPanel);
  }
  

  public interface LhSideBodyStep {
    DickyStep lhSideBody(String lhSideBody);
  }
  

  public interface DickyStep {
    RhFenderStep dicky(String dicky);
  }
  

  public interface RhFenderStep {
    RhFrtDoorStep rhFender(String rhFender);
  }
  

  public interface RhFrtDoorStep {
    RhRearDoorStep rhFrtDoor(String rhFrtDoor);
  }
  

  public interface RhRearDoorStep {
    RhQtrPanelStep rhRearDoor(String rhRearDoor);
  }
  

  public interface RhQtrPanelStep {
    RhSideBodyStep rhQtrPanel(String rhQtrPanel);
  }
  

  public interface RhSideBodyStep {
    FrontBumperStep rhSideBody(String rhSideBody);
  }
  

  public interface FrontBumperStep {
    RearBumperStep frontBumper(String frontBumper);
  }
  

  public interface RearBumperStep {
    FrtWsGlassStep rearBumper(String rearBumper);
  }
  

  public interface FrtWsGlassStep {
    LhFrtDoorGlassStep frtWsGlass(String frtWsGlass);
  }
  

  public interface LhFrtDoorGlassStep {
    LhRearDoorGlassStep lhFrtDoorGlass(String lhFrtDoorGlass);
  }
  

  public interface LhRearDoorGlassStep {
    RhFrtDoorGlassStep lhRearDoorGlass(String lhRearDoorGlass);
  }
  

  public interface RhFrtDoorGlassStep {
    RhRearDoorGlassStep rhFrtDoorGlass(String rhFrtDoorGlass);
  }
  

  public interface RhRearDoorGlassStep {
    RhQtrGlassStep rhRearDoorGlass(String rhRearDoorGlass);
  }
  

  public interface RhQtrGlassStep {
    LhQtrGlassStep rhQtrGlass(String rhQtrGlass);
  }
  

  public interface LhQtrGlassStep {
    DickyGlassStep lhQtrGlass(String lhQtrGlass);
  }
  

  public interface DickyGlassStep {
    HeadLampsStep dickyGlass(String dickyGlass);
  }
  

  public interface HeadLampsStep {
    TailLampsStep headLamps(String headLamps);
  }
  

  public interface TailLampsStep {
    TyreWheelStep tailLamps(String tailLamps);
  }
  

  public interface TyreWheelStep {
    RearViewMirrorStep tyreWheel(String tyreWheel);
  }
  

  public interface RearViewMirrorStep {
    DashBoardIPanelStep rearViewMirror(String rearViewMirror);
  }
  

  public interface DashBoardIPanelStep {
    EleAccessoriesStep dashBoardIPanel(String dashBoardIPanel);
  }
  

  public interface EleAccessoriesStep {
    NonEleAccessoriesStep eleAccessories(String eleAccessories);
  }
  

  public interface NonEleAccessoriesStep {
    RecommendedForInsuranceStep nonEleAccessories(String nonEleAccessories);
  }
  

  public interface RecommendedForInsuranceStep {
    RemarksStep recommendedForInsurance(String recommendedForInsurance);
  }
  

  public interface RemarksStep {
    BuildStep remarks(String remarks);
  }
  

  public interface BuildStep {
    Inspectionfour build();
    BuildStep id(String id);
  }
  

  public static class Builder implements GeneratedReportsStep, InsurerDetailsStep, NameofProposerStep, DateStep, TimeStep, PlaceofInspectionStep, VehicleRegdNoStep, MakeModelStep, DateofRegdPurchaseStep, ChassisNoStep, EngineNoStep, MiloMeterStep, RoofStep, BonnetStep, LhFenderStep, LhFrtDoorStep, LhRearDoorStep, LhQtrPanelStep, LhSideBodyStep, DickyStep, RhFenderStep, RhFrtDoorStep, RhRearDoorStep, RhQtrPanelStep, RhSideBodyStep, FrontBumperStep, RearBumperStep, FrtWsGlassStep, LhFrtDoorGlassStep, LhRearDoorGlassStep, RhFrtDoorGlassStep, RhRearDoorGlassStep, RhQtrGlassStep, LhQtrGlassStep, DickyGlassStep, HeadLampsStep, TailLampsStep, TyreWheelStep, RearViewMirrorStep, DashBoardIPanelStep, EleAccessoriesStep, NonEleAccessoriesStep, RecommendedForInsuranceStep, RemarksStep, BuildStep {
    private String id;
    private String GeneratedReports;
    private String InsurerDetails;
    private String NameofProposer;
    private String Date;
    private String Time;
    private String PlaceofInspection;
    private String VehicleRegdNo;
    private String MakeModel;
    private String DateofRegdPurchase;
    private String ChassisNo;
    private String EngineNo;
    private String MiloMeter;
    private String Roof;
    private String Bonnet;
    private String LhFender;
    private String LhFrtDoor;
    private String LhRearDoor;
    private String LhQtrPanel;
    private String LhSideBody;
    private String Dicky;
    private String RhFender;
    private String RhFrtDoor;
    private String RhRearDoor;
    private String RhQtrPanel;
    private String RhSideBody;
    private String FrontBumper;
    private String RearBumper;
    private String FrtWSGlass;
    private String LhFrtDoorGlass;
    private String LhRearDoorGlass;
    private String RhFrtDoorGlass;
    private String RhRearDoorGlass;
    private String RhQtrGlass;
    private String LhQtrGlass;
    private String DickyGlass;
    private String HeadLamps;
    private String TailLamps;
    private String TyreWheel;
    private String RearViewMirror;
    private String DashBoardIPanel;
    private String Ele_Accessories;
    private String NonEle_Accessories;
    private String RecommendedForInsurance;
    private String Remarks;
    @Override
     public Inspectionfour build() {
        String id = this.id != null ? this.id : UUID.randomUUID().toString();
        
        return new Inspectionfour(
          id,
          GeneratedReports,
          InsurerDetails,
          NameofProposer,
          Date,
          Time,
          PlaceofInspection,
          VehicleRegdNo,
          MakeModel,
          DateofRegdPurchase,
          ChassisNo,
          EngineNo,
          MiloMeter,
          Roof,
          Bonnet,
          LhFender,
          LhFrtDoor,
          LhRearDoor,
          LhQtrPanel,
          LhSideBody,
          Dicky,
          RhFender,
          RhFrtDoor,
          RhRearDoor,
          RhQtrPanel,
          RhSideBody,
          FrontBumper,
          RearBumper,
          FrtWSGlass,
          LhFrtDoorGlass,
          LhRearDoorGlass,
          RhFrtDoorGlass,
          RhRearDoorGlass,
          RhQtrGlass,
          LhQtrGlass,
          DickyGlass,
          HeadLamps,
          TailLamps,
          TyreWheel,
          RearViewMirror,
          DashBoardIPanel,
          Ele_Accessories,
          NonEle_Accessories,
          RecommendedForInsurance,
          Remarks);
    }
    
    @Override
     public InsurerDetailsStep generatedReports(String generatedReports) {
        Objects.requireNonNull(generatedReports);
        this.GeneratedReports = generatedReports;
        return this;
    }
    
    @Override
     public NameofProposerStep insurerDetails(String insurerDetails) {
        Objects.requireNonNull(insurerDetails);
        this.InsurerDetails = insurerDetails;
        return this;
    }
    
    @Override
     public DateStep nameofProposer(String nameofProposer) {
        Objects.requireNonNull(nameofProposer);
        this.NameofProposer = nameofProposer;
        return this;
    }
    
    @Override
     public TimeStep date(String date) {
        Objects.requireNonNull(date);
        this.Date = date;
        return this;
    }
    
    @Override
     public PlaceofInspectionStep time(String time) {
        Objects.requireNonNull(time);
        this.Time = time;
        return this;
    }
    
    @Override
     public VehicleRegdNoStep placeofInspection(String placeofInspection) {
        Objects.requireNonNull(placeofInspection);
        this.PlaceofInspection = placeofInspection;
        return this;
    }
    
    @Override
     public MakeModelStep vehicleRegdNo(String vehicleRegdNo) {
        Objects.requireNonNull(vehicleRegdNo);
        this.VehicleRegdNo = vehicleRegdNo;
        return this;
    }
    
    @Override
     public DateofRegdPurchaseStep makeModel(String makeModel) {
        Objects.requireNonNull(makeModel);
        this.MakeModel = makeModel;
        return this;
    }
    
    @Override
     public ChassisNoStep dateofRegdPurchase(String dateofRegdPurchase) {
        Objects.requireNonNull(dateofRegdPurchase);
        this.DateofRegdPurchase = dateofRegdPurchase;
        return this;
    }
    
    @Override
     public EngineNoStep chassisNo(String chassisNo) {
        Objects.requireNonNull(chassisNo);
        this.ChassisNo = chassisNo;
        return this;
    }
    
    @Override
     public MiloMeterStep engineNo(String engineNo) {
        Objects.requireNonNull(engineNo);
        this.EngineNo = engineNo;
        return this;
    }
    
    @Override
     public RoofStep miloMeter(String miloMeter) {
        Objects.requireNonNull(miloMeter);
        this.MiloMeter = miloMeter;
        return this;
    }
    
    @Override
     public BonnetStep roof(String roof) {
        Objects.requireNonNull(roof);
        this.Roof = roof;
        return this;
    }
    
    @Override
     public LhFenderStep bonnet(String bonnet) {
        Objects.requireNonNull(bonnet);
        this.Bonnet = bonnet;
        return this;
    }
    
    @Override
     public LhFrtDoorStep lhFender(String lhFender) {
        Objects.requireNonNull(lhFender);
        this.LhFender = lhFender;
        return this;
    }
    
    @Override
     public LhRearDoorStep lhFrtDoor(String lhFrtDoor) {
        Objects.requireNonNull(lhFrtDoor);
        this.LhFrtDoor = lhFrtDoor;
        return this;
    }
    
    @Override
     public LhQtrPanelStep lhRearDoor(String lhRearDoor) {
        Objects.requireNonNull(lhRearDoor);
        this.LhRearDoor = lhRearDoor;
        return this;
    }
    
    @Override
     public LhSideBodyStep lhQtrPanel(String lhQtrPanel) {
        Objects.requireNonNull(lhQtrPanel);
        this.LhQtrPanel = lhQtrPanel;
        return this;
    }
    
    @Override
     public DickyStep lhSideBody(String lhSideBody) {
        Objects.requireNonNull(lhSideBody);
        this.LhSideBody = lhSideBody;
        return this;
    }
    
    @Override
     public RhFenderStep dicky(String dicky) {
        Objects.requireNonNull(dicky);
        this.Dicky = dicky;
        return this;
    }
    
    @Override
     public RhFrtDoorStep rhFender(String rhFender) {
        Objects.requireNonNull(rhFender);
        this.RhFender = rhFender;
        return this;
    }
    
    @Override
     public RhRearDoorStep rhFrtDoor(String rhFrtDoor) {
        Objects.requireNonNull(rhFrtDoor);
        this.RhFrtDoor = rhFrtDoor;
        return this;
    }
    
    @Override
     public RhQtrPanelStep rhRearDoor(String rhRearDoor) {
        Objects.requireNonNull(rhRearDoor);
        this.RhRearDoor = rhRearDoor;
        return this;
    }
    
    @Override
     public RhSideBodyStep rhQtrPanel(String rhQtrPanel) {
        Objects.requireNonNull(rhQtrPanel);
        this.RhQtrPanel = rhQtrPanel;
        return this;
    }
    
    @Override
     public FrontBumperStep rhSideBody(String rhSideBody) {
        Objects.requireNonNull(rhSideBody);
        this.RhSideBody = rhSideBody;
        return this;
    }
    
    @Override
     public RearBumperStep frontBumper(String frontBumper) {
        Objects.requireNonNull(frontBumper);
        this.FrontBumper = frontBumper;
        return this;
    }
    
    @Override
     public FrtWsGlassStep rearBumper(String rearBumper) {
        Objects.requireNonNull(rearBumper);
        this.RearBumper = rearBumper;
        return this;
    }
    
    @Override
     public LhFrtDoorGlassStep frtWsGlass(String frtWsGlass) {
        Objects.requireNonNull(frtWsGlass);
        this.FrtWSGlass = frtWsGlass;
        return this;
    }
    
    @Override
     public LhRearDoorGlassStep lhFrtDoorGlass(String lhFrtDoorGlass) {
        Objects.requireNonNull(lhFrtDoorGlass);
        this.LhFrtDoorGlass = lhFrtDoorGlass;
        return this;
    }
    
    @Override
     public RhFrtDoorGlassStep lhRearDoorGlass(String lhRearDoorGlass) {
        Objects.requireNonNull(lhRearDoorGlass);
        this.LhRearDoorGlass = lhRearDoorGlass;
        return this;
    }
    
    @Override
     public RhRearDoorGlassStep rhFrtDoorGlass(String rhFrtDoorGlass) {
        Objects.requireNonNull(rhFrtDoorGlass);
        this.RhFrtDoorGlass = rhFrtDoorGlass;
        return this;
    }
    
    @Override
     public RhQtrGlassStep rhRearDoorGlass(String rhRearDoorGlass) {
        Objects.requireNonNull(rhRearDoorGlass);
        this.RhRearDoorGlass = rhRearDoorGlass;
        return this;
    }
    
    @Override
     public LhQtrGlassStep rhQtrGlass(String rhQtrGlass) {
        Objects.requireNonNull(rhQtrGlass);
        this.RhQtrGlass = rhQtrGlass;
        return this;
    }
    
    @Override
     public DickyGlassStep lhQtrGlass(String lhQtrGlass) {
        Objects.requireNonNull(lhQtrGlass);
        this.LhQtrGlass = lhQtrGlass;
        return this;
    }
    
    @Override
     public HeadLampsStep dickyGlass(String dickyGlass) {
        Objects.requireNonNull(dickyGlass);
        this.DickyGlass = dickyGlass;
        return this;
    }
    
    @Override
     public TailLampsStep headLamps(String headLamps) {
        Objects.requireNonNull(headLamps);
        this.HeadLamps = headLamps;
        return this;
    }
    
    @Override
     public TyreWheelStep tailLamps(String tailLamps) {
        Objects.requireNonNull(tailLamps);
        this.TailLamps = tailLamps;
        return this;
    }
    
    @Override
     public RearViewMirrorStep tyreWheel(String tyreWheel) {
        Objects.requireNonNull(tyreWheel);
        this.TyreWheel = tyreWheel;
        return this;
    }
    
    @Override
     public DashBoardIPanelStep rearViewMirror(String rearViewMirror) {
        Objects.requireNonNull(rearViewMirror);
        this.RearViewMirror = rearViewMirror;
        return this;
    }
    
    @Override
     public EleAccessoriesStep dashBoardIPanel(String dashBoardIPanel) {
        Objects.requireNonNull(dashBoardIPanel);
        this.DashBoardIPanel = dashBoardIPanel;
        return this;
    }
    
    @Override
     public NonEleAccessoriesStep eleAccessories(String eleAccessories) {
        Objects.requireNonNull(eleAccessories);
        this.Ele_Accessories = eleAccessories;
        return this;
    }
    
    @Override
     public RecommendedForInsuranceStep nonEleAccessories(String nonEleAccessories) {
        Objects.requireNonNull(nonEleAccessories);
        this.NonEle_Accessories = nonEleAccessories;
        return this;
    }
    
    @Override
     public RemarksStep recommendedForInsurance(String recommendedForInsurance) {
        Objects.requireNonNull(recommendedForInsurance);
        this.RecommendedForInsurance = recommendedForInsurance;
        return this;
    }
    
    @Override
     public BuildStep remarks(String remarks) {
        Objects.requireNonNull(remarks);
        this.Remarks = remarks;
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
    private CopyOfBuilder(String id, String generatedReports, String insurerDetails, String nameofProposer, String date, String time, String placeofInspection, String vehicleRegdNo, String makeModel, String dateofRegdPurchase, String chassisNo, String engineNo, String miloMeter, String roof, String bonnet, String lhFender, String lhFrtDoor, String lhRearDoor, String lhQtrPanel, String lhSideBody, String dicky, String rhFender, String rhFrtDoor, String rhRearDoor, String rhQtrPanel, String rhSideBody, String frontBumper, String rearBumper, String frtWsGlass, String lhFrtDoorGlass, String lhRearDoorGlass, String rhFrtDoorGlass, String rhRearDoorGlass, String rhQtrGlass, String lhQtrGlass, String dickyGlass, String headLamps, String tailLamps, String tyreWheel, String rearViewMirror, String dashBoardIPanel, String eleAccessories, String nonEleAccessories, String recommendedForInsurance, String remarks) {
      super.id(id);
      super.generatedReports(generatedReports)
        .insurerDetails(insurerDetails)
        .nameofProposer(nameofProposer)
        .date(date)
        .time(time)
        .placeofInspection(placeofInspection)
        .vehicleRegdNo(vehicleRegdNo)
        .makeModel(makeModel)
        .dateofRegdPurchase(dateofRegdPurchase)
        .chassisNo(chassisNo)
        .engineNo(engineNo)
        .miloMeter(miloMeter)
        .roof(roof)
        .bonnet(bonnet)
        .lhFender(lhFender)
        .lhFrtDoor(lhFrtDoor)
        .lhRearDoor(lhRearDoor)
        .lhQtrPanel(lhQtrPanel)
        .lhSideBody(lhSideBody)
        .dicky(dicky)
        .rhFender(rhFender)
        .rhFrtDoor(rhFrtDoor)
        .rhRearDoor(rhRearDoor)
        .rhQtrPanel(rhQtrPanel)
        .rhSideBody(rhSideBody)
        .frontBumper(frontBumper)
        .rearBumper(rearBumper)
        .frtWsGlass(frtWsGlass)
        .lhFrtDoorGlass(lhFrtDoorGlass)
        .lhRearDoorGlass(lhRearDoorGlass)
        .rhFrtDoorGlass(rhFrtDoorGlass)
        .rhRearDoorGlass(rhRearDoorGlass)
        .rhQtrGlass(rhQtrGlass)
        .lhQtrGlass(lhQtrGlass)
        .dickyGlass(dickyGlass)
        .headLamps(headLamps)
        .tailLamps(tailLamps)
        .tyreWheel(tyreWheel)
        .rearViewMirror(rearViewMirror)
        .dashBoardIPanel(dashBoardIPanel)
        .eleAccessories(eleAccessories)
        .nonEleAccessories(nonEleAccessories)
        .recommendedForInsurance(recommendedForInsurance)
        .remarks(remarks);
    }
    
    @Override
     public CopyOfBuilder generatedReports(String generatedReports) {
      return (CopyOfBuilder) super.generatedReports(generatedReports);
    }
    
    @Override
     public CopyOfBuilder insurerDetails(String insurerDetails) {
      return (CopyOfBuilder) super.insurerDetails(insurerDetails);
    }
    
    @Override
     public CopyOfBuilder nameofProposer(String nameofProposer) {
      return (CopyOfBuilder) super.nameofProposer(nameofProposer);
    }
    
    @Override
     public CopyOfBuilder date(String date) {
      return (CopyOfBuilder) super.date(date);
    }
    
    @Override
     public CopyOfBuilder time(String time) {
      return (CopyOfBuilder) super.time(time);
    }
    
    @Override
     public CopyOfBuilder placeofInspection(String placeofInspection) {
      return (CopyOfBuilder) super.placeofInspection(placeofInspection);
    }
    
    @Override
     public CopyOfBuilder vehicleRegdNo(String vehicleRegdNo) {
      return (CopyOfBuilder) super.vehicleRegdNo(vehicleRegdNo);
    }
    
    @Override
     public CopyOfBuilder makeModel(String makeModel) {
      return (CopyOfBuilder) super.makeModel(makeModel);
    }
    
    @Override
     public CopyOfBuilder dateofRegdPurchase(String dateofRegdPurchase) {
      return (CopyOfBuilder) super.dateofRegdPurchase(dateofRegdPurchase);
    }
    
    @Override
     public CopyOfBuilder chassisNo(String chassisNo) {
      return (CopyOfBuilder) super.chassisNo(chassisNo);
    }
    
    @Override
     public CopyOfBuilder engineNo(String engineNo) {
      return (CopyOfBuilder) super.engineNo(engineNo);
    }
    
    @Override
     public CopyOfBuilder miloMeter(String miloMeter) {
      return (CopyOfBuilder) super.miloMeter(miloMeter);
    }
    
    @Override
     public CopyOfBuilder roof(String roof) {
      return (CopyOfBuilder) super.roof(roof);
    }
    
    @Override
     public CopyOfBuilder bonnet(String bonnet) {
      return (CopyOfBuilder) super.bonnet(bonnet);
    }
    
    @Override
     public CopyOfBuilder lhFender(String lhFender) {
      return (CopyOfBuilder) super.lhFender(lhFender);
    }
    
    @Override
     public CopyOfBuilder lhFrtDoor(String lhFrtDoor) {
      return (CopyOfBuilder) super.lhFrtDoor(lhFrtDoor);
    }
    
    @Override
     public CopyOfBuilder lhRearDoor(String lhRearDoor) {
      return (CopyOfBuilder) super.lhRearDoor(lhRearDoor);
    }
    
    @Override
     public CopyOfBuilder lhQtrPanel(String lhQtrPanel) {
      return (CopyOfBuilder) super.lhQtrPanel(lhQtrPanel);
    }
    
    @Override
     public CopyOfBuilder lhSideBody(String lhSideBody) {
      return (CopyOfBuilder) super.lhSideBody(lhSideBody);
    }
    
    @Override
     public CopyOfBuilder dicky(String dicky) {
      return (CopyOfBuilder) super.dicky(dicky);
    }
    
    @Override
     public CopyOfBuilder rhFender(String rhFender) {
      return (CopyOfBuilder) super.rhFender(rhFender);
    }
    
    @Override
     public CopyOfBuilder rhFrtDoor(String rhFrtDoor) {
      return (CopyOfBuilder) super.rhFrtDoor(rhFrtDoor);
    }
    
    @Override
     public CopyOfBuilder rhRearDoor(String rhRearDoor) {
      return (CopyOfBuilder) super.rhRearDoor(rhRearDoor);
    }
    
    @Override
     public CopyOfBuilder rhQtrPanel(String rhQtrPanel) {
      return (CopyOfBuilder) super.rhQtrPanel(rhQtrPanel);
    }
    
    @Override
     public CopyOfBuilder rhSideBody(String rhSideBody) {
      return (CopyOfBuilder) super.rhSideBody(rhSideBody);
    }
    
    @Override
     public CopyOfBuilder frontBumper(String frontBumper) {
      return (CopyOfBuilder) super.frontBumper(frontBumper);
    }
    
    @Override
     public CopyOfBuilder rearBumper(String rearBumper) {
      return (CopyOfBuilder) super.rearBumper(rearBumper);
    }
    
    @Override
     public CopyOfBuilder frtWsGlass(String frtWsGlass) {
      return (CopyOfBuilder) super.frtWsGlass(frtWsGlass);
    }
    
    @Override
     public CopyOfBuilder lhFrtDoorGlass(String lhFrtDoorGlass) {
      return (CopyOfBuilder) super.lhFrtDoorGlass(lhFrtDoorGlass);
    }
    
    @Override
     public CopyOfBuilder lhRearDoorGlass(String lhRearDoorGlass) {
      return (CopyOfBuilder) super.lhRearDoorGlass(lhRearDoorGlass);
    }
    
    @Override
     public CopyOfBuilder rhFrtDoorGlass(String rhFrtDoorGlass) {
      return (CopyOfBuilder) super.rhFrtDoorGlass(rhFrtDoorGlass);
    }
    
    @Override
     public CopyOfBuilder rhRearDoorGlass(String rhRearDoorGlass) {
      return (CopyOfBuilder) super.rhRearDoorGlass(rhRearDoorGlass);
    }
    
    @Override
     public CopyOfBuilder rhQtrGlass(String rhQtrGlass) {
      return (CopyOfBuilder) super.rhQtrGlass(rhQtrGlass);
    }
    
    @Override
     public CopyOfBuilder lhQtrGlass(String lhQtrGlass) {
      return (CopyOfBuilder) super.lhQtrGlass(lhQtrGlass);
    }
    
    @Override
     public CopyOfBuilder dickyGlass(String dickyGlass) {
      return (CopyOfBuilder) super.dickyGlass(dickyGlass);
    }
    
    @Override
     public CopyOfBuilder headLamps(String headLamps) {
      return (CopyOfBuilder) super.headLamps(headLamps);
    }
    
    @Override
     public CopyOfBuilder tailLamps(String tailLamps) {
      return (CopyOfBuilder) super.tailLamps(tailLamps);
    }
    
    @Override
     public CopyOfBuilder tyreWheel(String tyreWheel) {
      return (CopyOfBuilder) super.tyreWheel(tyreWheel);
    }
    
    @Override
     public CopyOfBuilder rearViewMirror(String rearViewMirror) {
      return (CopyOfBuilder) super.rearViewMirror(rearViewMirror);
    }
    
    @Override
     public CopyOfBuilder dashBoardIPanel(String dashBoardIPanel) {
      return (CopyOfBuilder) super.dashBoardIPanel(dashBoardIPanel);
    }
    
    @Override
     public CopyOfBuilder eleAccessories(String eleAccessories) {
      return (CopyOfBuilder) super.eleAccessories(eleAccessories);
    }
    
    @Override
     public CopyOfBuilder nonEleAccessories(String nonEleAccessories) {
      return (CopyOfBuilder) super.nonEleAccessories(nonEleAccessories);
    }
    
    @Override
     public CopyOfBuilder recommendedForInsurance(String recommendedForInsurance) {
      return (CopyOfBuilder) super.recommendedForInsurance(recommendedForInsurance);
    }
    
    @Override
     public CopyOfBuilder remarks(String remarks) {
      return (CopyOfBuilder) super.remarks(remarks);
    }
  }
  
}
