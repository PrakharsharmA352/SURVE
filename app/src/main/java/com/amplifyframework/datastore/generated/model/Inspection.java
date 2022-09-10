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

/** This is an auto generated class representing the Inspection type in your schema. */
@SuppressWarnings("all")
@ModelConfig(pluralName = "Inspections")
public final class Inspection implements Model {
  public static final QueryField ID = field("Inspection", "id");
  public static final QueryField GENERATED_REPORTS = field("Inspection", "GeneratedReports");
  public static final QueryField INSURER_DETAILS = field("Inspection", "InsurerDetails");
  public static final QueryField NAMEOF_PROPOSER = field("Inspection", "NameofProposer");
  public static final QueryField DATE = field("Inspection", "Date");
  public static final QueryField TIME = field("Inspection", "Time");
  public static final QueryField PLACEOF_INSPECTION = field("Inspection", "PlaceofInspection");
  public static final QueryField VEHICLE_REGD_NO = field("Inspection", "VehicleRegdNo");
  public static final QueryField MAKE_MODEL = field("Inspection", "MakeModel");
  public static final QueryField DATEOF_REGD_PURCHASE = field("Inspection", "DateofRegdPurchase");
  public static final QueryField CHASSIS_NO = field("Inspection", "ChassisNo");
  public static final QueryField ENGINE_NO = field("Inspection", "EngineNo");
  public static final QueryField MILO_METER = field("Inspection", "MiloMeter");
  public static final QueryField FRT_MUD_GUARD = field("Inspection", "FrtMudGuard");
  public static final QueryField FORK = field("Inspection", "Fork");
  public static final QueryField HANDLE = field("Inspection", "Handle");
  public static final QueryField SPEEDOMETER = field("Inspection", "Speedometer");
  public static final QueryField FUEL_TANK = field("Inspection", "FuelTank");
  public static final QueryField REAR_MUD_GUARD = field("Inspection", "RearMudGuard");
  public static final QueryField SILENCER = field("Inspection", "Silencer");
  public static final QueryField CRANK_CASE = field("Inspection", "CrankCase");
  public static final QueryField SEATS = field("Inspection", "Seats");
  public static final QueryField LEG_GUARD = field("Inspection", "LegGuard");
  public static final QueryField WHEEL_RIM = field("Inspection", "WheelRim");
  public static final QueryField HEAD_LAMP = field("Inspection", "HeadLamp");
  public static final QueryField TAIL_LAMP = field("Inspection", "TailLamp");
  public static final QueryField FRT_VISOR_COWL = field("Inspection", "FrtVisorCowl");
  public static final QueryField FRT_RH_INDICATOR = field("Inspection", "FrtRhIndicator");
  public static final QueryField FRT_LH_INDICATOR = field("Inspection", "FrtLhIndicator");
  public static final QueryField REAR_RH_INDICATOR = field("Inspection", "RearRhIndicator");
  public static final QueryField REAR_LH_INDICATOR = field("Inspection", "RearLhIndicator");
  public static final QueryField RH_SIDE_COVER = field("Inspection", "RhSideCover");
  public static final QueryField LH_SIDE_COVER = field("Inspection", "LhSideCover");
  public static final QueryField CLUTCH_BRAKE_LEVER = field("Inspection", "ClutchBrakeLever");
  public static final QueryField TYRE = field("Inspection", "Tyre");
  public static final QueryField RECOMMANDEDFORINSURANCE = field("Inspection", "Recommandedforinsurance");
  public static final QueryField REMARK = field("Inspection", "Remark");
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
  private final @ModelField(targetType="String", isRequired = true) String FrtMudGuard;
  private final @ModelField(targetType="String", isRequired = true) String Fork;
  private final @ModelField(targetType="String", isRequired = true) String Handle;
  private final @ModelField(targetType="String", isRequired = true) String Speedometer;
  private final @ModelField(targetType="String", isRequired = true) String FuelTank;
  private final @ModelField(targetType="String", isRequired = true) String RearMudGuard;
  private final @ModelField(targetType="String", isRequired = true) String Silencer;
  private final @ModelField(targetType="String", isRequired = true) String CrankCase;
  private final @ModelField(targetType="String", isRequired = true) String Seats;
  private final @ModelField(targetType="String", isRequired = true) String LegGuard;
  private final @ModelField(targetType="String", isRequired = true) String WheelRim;
  private final @ModelField(targetType="String", isRequired = true) String HeadLamp;
  private final @ModelField(targetType="String", isRequired = true) String TailLamp;
  private final @ModelField(targetType="String", isRequired = true) String FrtVisorCowl;
  private final @ModelField(targetType="String", isRequired = true) String FrtRhIndicator;
  private final @ModelField(targetType="String", isRequired = true) String FrtLhIndicator;
  private final @ModelField(targetType="String", isRequired = true) String RearRhIndicator;
  private final @ModelField(targetType="String", isRequired = true) String RearLhIndicator;
  private final @ModelField(targetType="String", isRequired = true) String RhSideCover;
  private final @ModelField(targetType="String", isRequired = true) String LhSideCover;
  private final @ModelField(targetType="String", isRequired = true) String ClutchBrakeLever;
  private final @ModelField(targetType="String", isRequired = true) String Tyre;
  private final @ModelField(targetType="String", isRequired = true) String Recommandedforinsurance;
  private final @ModelField(targetType="String", isRequired = true) String Remark;
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
  
  public String getFrtMudGuard() {
      return FrtMudGuard;
  }
  
  public String getFork() {
      return Fork;
  }
  
  public String getHandle() {
      return Handle;
  }
  
  public String getSpeedometer() {
      return Speedometer;
  }
  
  public String getFuelTank() {
      return FuelTank;
  }
  
  public String getRearMudGuard() {
      return RearMudGuard;
  }
  
  public String getSilencer() {
      return Silencer;
  }
  
  public String getCrankCase() {
      return CrankCase;
  }
  
  public String getSeats() {
      return Seats;
  }
  
  public String getLegGuard() {
      return LegGuard;
  }
  
  public String getWheelRim() {
      return WheelRim;
  }
  
  public String getHeadLamp() {
      return HeadLamp;
  }
  
  public String getTailLamp() {
      return TailLamp;
  }
  
  public String getFrtVisorCowl() {
      return FrtVisorCowl;
  }
  
  public String getFrtRhIndicator() {
      return FrtRhIndicator;
  }
  
  public String getFrtLhIndicator() {
      return FrtLhIndicator;
  }
  
  public String getRearRhIndicator() {
      return RearRhIndicator;
  }
  
  public String getRearLhIndicator() {
      return RearLhIndicator;
  }
  
  public String getRhSideCover() {
      return RhSideCover;
  }
  
  public String getLhSideCover() {
      return LhSideCover;
  }
  
  public String getClutchBrakeLever() {
      return ClutchBrakeLever;
  }
  
  public String getTyre() {
      return Tyre;
  }
  
  public String getRecommandedforinsurance() {
      return Recommandedforinsurance;
  }
  
  public String getRemark() {
      return Remark;
  }
  
  public Temporal.DateTime getCreatedAt() {
      return createdAt;
  }
  
  public Temporal.DateTime getUpdatedAt() {
      return updatedAt;
  }
  
  private Inspection(String id, String GeneratedReports, String InsurerDetails, String NameofProposer, String Date, String Time, String PlaceofInspection, String VehicleRegdNo, String MakeModel, String DateofRegdPurchase, String ChassisNo, String EngineNo, String MiloMeter, String FrtMudGuard, String Fork, String Handle, String Speedometer, String FuelTank, String RearMudGuard, String Silencer, String CrankCase, String Seats, String LegGuard, String WheelRim, String HeadLamp, String TailLamp, String FrtVisorCowl, String FrtRhIndicator, String FrtLhIndicator, String RearRhIndicator, String RearLhIndicator, String RhSideCover, String LhSideCover, String ClutchBrakeLever, String Tyre, String Recommandedforinsurance, String Remark) {
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
    this.FrtMudGuard = FrtMudGuard;
    this.Fork = Fork;
    this.Handle = Handle;
    this.Speedometer = Speedometer;
    this.FuelTank = FuelTank;
    this.RearMudGuard = RearMudGuard;
    this.Silencer = Silencer;
    this.CrankCase = CrankCase;
    this.Seats = Seats;
    this.LegGuard = LegGuard;
    this.WheelRim = WheelRim;
    this.HeadLamp = HeadLamp;
    this.TailLamp = TailLamp;
    this.FrtVisorCowl = FrtVisorCowl;
    this.FrtRhIndicator = FrtRhIndicator;
    this.FrtLhIndicator = FrtLhIndicator;
    this.RearRhIndicator = RearRhIndicator;
    this.RearLhIndicator = RearLhIndicator;
    this.RhSideCover = RhSideCover;
    this.LhSideCover = LhSideCover;
    this.ClutchBrakeLever = ClutchBrakeLever;
    this.Tyre = Tyre;
    this.Recommandedforinsurance = Recommandedforinsurance;
    this.Remark = Remark;
  }
  
  @Override
   public boolean equals(Object obj) {
      if (this == obj) {
        return true;
      } else if(obj == null || getClass() != obj.getClass()) {
        return false;
      } else {
      Inspection inspection = (Inspection) obj;
      return ObjectsCompat.equals(getId(), inspection.getId()) &&
              ObjectsCompat.equals(getGeneratedReports(), inspection.getGeneratedReports()) &&
              ObjectsCompat.equals(getInsurerDetails(), inspection.getInsurerDetails()) &&
              ObjectsCompat.equals(getNameofProposer(), inspection.getNameofProposer()) &&
              ObjectsCompat.equals(getDate(), inspection.getDate()) &&
              ObjectsCompat.equals(getTime(), inspection.getTime()) &&
              ObjectsCompat.equals(getPlaceofInspection(), inspection.getPlaceofInspection()) &&
              ObjectsCompat.equals(getVehicleRegdNo(), inspection.getVehicleRegdNo()) &&
              ObjectsCompat.equals(getMakeModel(), inspection.getMakeModel()) &&
              ObjectsCompat.equals(getDateofRegdPurchase(), inspection.getDateofRegdPurchase()) &&
              ObjectsCompat.equals(getChassisNo(), inspection.getChassisNo()) &&
              ObjectsCompat.equals(getEngineNo(), inspection.getEngineNo()) &&
              ObjectsCompat.equals(getMiloMeter(), inspection.getMiloMeter()) &&
              ObjectsCompat.equals(getFrtMudGuard(), inspection.getFrtMudGuard()) &&
              ObjectsCompat.equals(getFork(), inspection.getFork()) &&
              ObjectsCompat.equals(getHandle(), inspection.getHandle()) &&
              ObjectsCompat.equals(getSpeedometer(), inspection.getSpeedometer()) &&
              ObjectsCompat.equals(getFuelTank(), inspection.getFuelTank()) &&
              ObjectsCompat.equals(getRearMudGuard(), inspection.getRearMudGuard()) &&
              ObjectsCompat.equals(getSilencer(), inspection.getSilencer()) &&
              ObjectsCompat.equals(getCrankCase(), inspection.getCrankCase()) &&
              ObjectsCompat.equals(getSeats(), inspection.getSeats()) &&
              ObjectsCompat.equals(getLegGuard(), inspection.getLegGuard()) &&
              ObjectsCompat.equals(getWheelRim(), inspection.getWheelRim()) &&
              ObjectsCompat.equals(getHeadLamp(), inspection.getHeadLamp()) &&
              ObjectsCompat.equals(getTailLamp(), inspection.getTailLamp()) &&
              ObjectsCompat.equals(getFrtVisorCowl(), inspection.getFrtVisorCowl()) &&
              ObjectsCompat.equals(getFrtRhIndicator(), inspection.getFrtRhIndicator()) &&
              ObjectsCompat.equals(getFrtLhIndicator(), inspection.getFrtLhIndicator()) &&
              ObjectsCompat.equals(getRearRhIndicator(), inspection.getRearRhIndicator()) &&
              ObjectsCompat.equals(getRearLhIndicator(), inspection.getRearLhIndicator()) &&
              ObjectsCompat.equals(getRhSideCover(), inspection.getRhSideCover()) &&
              ObjectsCompat.equals(getLhSideCover(), inspection.getLhSideCover()) &&
              ObjectsCompat.equals(getClutchBrakeLever(), inspection.getClutchBrakeLever()) &&
              ObjectsCompat.equals(getTyre(), inspection.getTyre()) &&
              ObjectsCompat.equals(getRecommandedforinsurance(), inspection.getRecommandedforinsurance()) &&
              ObjectsCompat.equals(getRemark(), inspection.getRemark()) &&
              ObjectsCompat.equals(getCreatedAt(), inspection.getCreatedAt()) &&
              ObjectsCompat.equals(getUpdatedAt(), inspection.getUpdatedAt());
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
      .append(getFrtMudGuard())
      .append(getFork())
      .append(getHandle())
      .append(getSpeedometer())
      .append(getFuelTank())
      .append(getRearMudGuard())
      .append(getSilencer())
      .append(getCrankCase())
      .append(getSeats())
      .append(getLegGuard())
      .append(getWheelRim())
      .append(getHeadLamp())
      .append(getTailLamp())
      .append(getFrtVisorCowl())
      .append(getFrtRhIndicator())
      .append(getFrtLhIndicator())
      .append(getRearRhIndicator())
      .append(getRearLhIndicator())
      .append(getRhSideCover())
      .append(getLhSideCover())
      .append(getClutchBrakeLever())
      .append(getTyre())
      .append(getRecommandedforinsurance())
      .append(getRemark())
      .append(getCreatedAt())
      .append(getUpdatedAt())
      .toString()
      .hashCode();
  }
  
  @Override
   public String toString() {
    return new StringBuilder()
      .append("Inspection {")
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
      .append("FrtMudGuard=" + String.valueOf(getFrtMudGuard()) + ", ")
      .append("Fork=" + String.valueOf(getFork()) + ", ")
      .append("Handle=" + String.valueOf(getHandle()) + ", ")
      .append("Speedometer=" + String.valueOf(getSpeedometer()) + ", ")
      .append("FuelTank=" + String.valueOf(getFuelTank()) + ", ")
      .append("RearMudGuard=" + String.valueOf(getRearMudGuard()) + ", ")
      .append("Silencer=" + String.valueOf(getSilencer()) + ", ")
      .append("CrankCase=" + String.valueOf(getCrankCase()) + ", ")
      .append("Seats=" + String.valueOf(getSeats()) + ", ")
      .append("LegGuard=" + String.valueOf(getLegGuard()) + ", ")
      .append("WheelRim=" + String.valueOf(getWheelRim()) + ", ")
      .append("HeadLamp=" + String.valueOf(getHeadLamp()) + ", ")
      .append("TailLamp=" + String.valueOf(getTailLamp()) + ", ")
      .append("FrtVisorCowl=" + String.valueOf(getFrtVisorCowl()) + ", ")
      .append("FrtRhIndicator=" + String.valueOf(getFrtRhIndicator()) + ", ")
      .append("FrtLhIndicator=" + String.valueOf(getFrtLhIndicator()) + ", ")
      .append("RearRhIndicator=" + String.valueOf(getRearRhIndicator()) + ", ")
      .append("RearLhIndicator=" + String.valueOf(getRearLhIndicator()) + ", ")
      .append("RhSideCover=" + String.valueOf(getRhSideCover()) + ", ")
      .append("LhSideCover=" + String.valueOf(getLhSideCover()) + ", ")
      .append("ClutchBrakeLever=" + String.valueOf(getClutchBrakeLever()) + ", ")
      .append("Tyre=" + String.valueOf(getTyre()) + ", ")
      .append("Recommandedforinsurance=" + String.valueOf(getRecommandedforinsurance()) + ", ")
      .append("Remark=" + String.valueOf(getRemark()) + ", ")
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
  public static Inspection justId(String id) {
    return new Inspection(
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
      FrtMudGuard,
      Fork,
      Handle,
      Speedometer,
      FuelTank,
      RearMudGuard,
      Silencer,
      CrankCase,
      Seats,
      LegGuard,
      WheelRim,
      HeadLamp,
      TailLamp,
      FrtVisorCowl,
      FrtRhIndicator,
      FrtLhIndicator,
      RearRhIndicator,
      RearLhIndicator,
      RhSideCover,
      LhSideCover,
      ClutchBrakeLever,
      Tyre,
      Recommandedforinsurance,
      Remark);
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
    FrtMudGuardStep miloMeter(String miloMeter);
  }
  

  public interface FrtMudGuardStep {
    ForkStep frtMudGuard(String frtMudGuard);
  }
  

  public interface ForkStep {
    HandleStep fork(String fork);
  }
  

  public interface HandleStep {
    SpeedometerStep handle(String handle);
  }
  

  public interface SpeedometerStep {
    FuelTankStep speedometer(String speedometer);
  }
  

  public interface FuelTankStep {
    RearMudGuardStep fuelTank(String fuelTank);
  }
  

  public interface RearMudGuardStep {
    SilencerStep rearMudGuard(String rearMudGuard);
  }
  

  public interface SilencerStep {
    CrankCaseStep silencer(String silencer);
  }
  

  public interface CrankCaseStep {
    SeatsStep crankCase(String crankCase);
  }
  

  public interface SeatsStep {
    LegGuardStep seats(String seats);
  }
  

  public interface LegGuardStep {
    WheelRimStep legGuard(String legGuard);
  }
  

  public interface WheelRimStep {
    HeadLampStep wheelRim(String wheelRim);
  }
  

  public interface HeadLampStep {
    TailLampStep headLamp(String headLamp);
  }
  

  public interface TailLampStep {
    FrtVisorCowlStep tailLamp(String tailLamp);
  }
  

  public interface FrtVisorCowlStep {
    FrtRhIndicatorStep frtVisorCowl(String frtVisorCowl);
  }
  

  public interface FrtRhIndicatorStep {
    FrtLhIndicatorStep frtRhIndicator(String frtRhIndicator);
  }
  

  public interface FrtLhIndicatorStep {
    RearRhIndicatorStep frtLhIndicator(String frtLhIndicator);
  }
  

  public interface RearRhIndicatorStep {
    RearLhIndicatorStep rearRhIndicator(String rearRhIndicator);
  }
  

  public interface RearLhIndicatorStep {
    RhSideCoverStep rearLhIndicator(String rearLhIndicator);
  }
  

  public interface RhSideCoverStep {
    LhSideCoverStep rhSideCover(String rhSideCover);
  }
  

  public interface LhSideCoverStep {
    ClutchBrakeLeverStep lhSideCover(String lhSideCover);
  }
  

  public interface ClutchBrakeLeverStep {
    TyreStep clutchBrakeLever(String clutchBrakeLever);
  }
  

  public interface TyreStep {
    RecommandedforinsuranceStep tyre(String tyre);
  }
  

  public interface RecommandedforinsuranceStep {
    RemarkStep recommandedforinsurance(String recommandedforinsurance);
  }
  

  public interface RemarkStep {
    BuildStep remark(String remark);
  }
  

  public interface BuildStep {
    Inspection build();
    BuildStep id(String id);
  }
  

  public static class Builder implements GeneratedReportsStep, InsurerDetailsStep, NameofProposerStep, DateStep, TimeStep, PlaceofInspectionStep, VehicleRegdNoStep, MakeModelStep, DateofRegdPurchaseStep, ChassisNoStep, EngineNoStep, MiloMeterStep, FrtMudGuardStep, ForkStep, HandleStep, SpeedometerStep, FuelTankStep, RearMudGuardStep, SilencerStep, CrankCaseStep, SeatsStep, LegGuardStep, WheelRimStep, HeadLampStep, TailLampStep, FrtVisorCowlStep, FrtRhIndicatorStep, FrtLhIndicatorStep, RearRhIndicatorStep, RearLhIndicatorStep, RhSideCoverStep, LhSideCoverStep, ClutchBrakeLeverStep, TyreStep, RecommandedforinsuranceStep, RemarkStep, BuildStep {
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
    private String FrtMudGuard;
    private String Fork;
    private String Handle;
    private String Speedometer;
    private String FuelTank;
    private String RearMudGuard;
    private String Silencer;
    private String CrankCase;
    private String Seats;
    private String LegGuard;
    private String WheelRim;
    private String HeadLamp;
    private String TailLamp;
    private String FrtVisorCowl;
    private String FrtRhIndicator;
    private String FrtLhIndicator;
    private String RearRhIndicator;
    private String RearLhIndicator;
    private String RhSideCover;
    private String LhSideCover;
    private String ClutchBrakeLever;
    private String Tyre;
    private String Recommandedforinsurance;
    private String Remark;
    @Override
     public Inspection build() {
        String id = this.id != null ? this.id : UUID.randomUUID().toString();
        
        return new Inspection(
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
          FrtMudGuard,
          Fork,
          Handle,
          Speedometer,
          FuelTank,
          RearMudGuard,
          Silencer,
          CrankCase,
          Seats,
          LegGuard,
          WheelRim,
          HeadLamp,
          TailLamp,
          FrtVisorCowl,
          FrtRhIndicator,
          FrtLhIndicator,
          RearRhIndicator,
          RearLhIndicator,
          RhSideCover,
          LhSideCover,
          ClutchBrakeLever,
          Tyre,
          Recommandedforinsurance,
          Remark);
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
     public FrtMudGuardStep miloMeter(String miloMeter) {
        Objects.requireNonNull(miloMeter);
        this.MiloMeter = miloMeter;
        return this;
    }
    
    @Override
     public ForkStep frtMudGuard(String frtMudGuard) {
        Objects.requireNonNull(frtMudGuard);
        this.FrtMudGuard = frtMudGuard;
        return this;
    }
    
    @Override
     public HandleStep fork(String fork) {
        Objects.requireNonNull(fork);
        this.Fork = fork;
        return this;
    }
    
    @Override
     public SpeedometerStep handle(String handle) {
        Objects.requireNonNull(handle);
        this.Handle = handle;
        return this;
    }
    
    @Override
     public FuelTankStep speedometer(String speedometer) {
        Objects.requireNonNull(speedometer);
        this.Speedometer = speedometer;
        return this;
    }
    
    @Override
     public RearMudGuardStep fuelTank(String fuelTank) {
        Objects.requireNonNull(fuelTank);
        this.FuelTank = fuelTank;
        return this;
    }
    
    @Override
     public SilencerStep rearMudGuard(String rearMudGuard) {
        Objects.requireNonNull(rearMudGuard);
        this.RearMudGuard = rearMudGuard;
        return this;
    }
    
    @Override
     public CrankCaseStep silencer(String silencer) {
        Objects.requireNonNull(silencer);
        this.Silencer = silencer;
        return this;
    }
    
    @Override
     public SeatsStep crankCase(String crankCase) {
        Objects.requireNonNull(crankCase);
        this.CrankCase = crankCase;
        return this;
    }
    
    @Override
     public LegGuardStep seats(String seats) {
        Objects.requireNonNull(seats);
        this.Seats = seats;
        return this;
    }
    
    @Override
     public WheelRimStep legGuard(String legGuard) {
        Objects.requireNonNull(legGuard);
        this.LegGuard = legGuard;
        return this;
    }
    
    @Override
     public HeadLampStep wheelRim(String wheelRim) {
        Objects.requireNonNull(wheelRim);
        this.WheelRim = wheelRim;
        return this;
    }
    
    @Override
     public TailLampStep headLamp(String headLamp) {
        Objects.requireNonNull(headLamp);
        this.HeadLamp = headLamp;
        return this;
    }
    
    @Override
     public FrtVisorCowlStep tailLamp(String tailLamp) {
        Objects.requireNonNull(tailLamp);
        this.TailLamp = tailLamp;
        return this;
    }
    
    @Override
     public FrtRhIndicatorStep frtVisorCowl(String frtVisorCowl) {
        Objects.requireNonNull(frtVisorCowl);
        this.FrtVisorCowl = frtVisorCowl;
        return this;
    }
    
    @Override
     public FrtLhIndicatorStep frtRhIndicator(String frtRhIndicator) {
        Objects.requireNonNull(frtRhIndicator);
        this.FrtRhIndicator = frtRhIndicator;
        return this;
    }
    
    @Override
     public RearRhIndicatorStep frtLhIndicator(String frtLhIndicator) {
        Objects.requireNonNull(frtLhIndicator);
        this.FrtLhIndicator = frtLhIndicator;
        return this;
    }
    
    @Override
     public RearLhIndicatorStep rearRhIndicator(String rearRhIndicator) {
        Objects.requireNonNull(rearRhIndicator);
        this.RearRhIndicator = rearRhIndicator;
        return this;
    }
    
    @Override
     public RhSideCoverStep rearLhIndicator(String rearLhIndicator) {
        Objects.requireNonNull(rearLhIndicator);
        this.RearLhIndicator = rearLhIndicator;
        return this;
    }
    
    @Override
     public LhSideCoverStep rhSideCover(String rhSideCover) {
        Objects.requireNonNull(rhSideCover);
        this.RhSideCover = rhSideCover;
        return this;
    }
    
    @Override
     public ClutchBrakeLeverStep lhSideCover(String lhSideCover) {
        Objects.requireNonNull(lhSideCover);
        this.LhSideCover = lhSideCover;
        return this;
    }
    
    @Override
     public TyreStep clutchBrakeLever(String clutchBrakeLever) {
        Objects.requireNonNull(clutchBrakeLever);
        this.ClutchBrakeLever = clutchBrakeLever;
        return this;
    }
    
    @Override
     public RecommandedforinsuranceStep tyre(String tyre) {
        Objects.requireNonNull(tyre);
        this.Tyre = tyre;
        return this;
    }
    
    @Override
     public RemarkStep recommandedforinsurance(String recommandedforinsurance) {
        Objects.requireNonNull(recommandedforinsurance);
        this.Recommandedforinsurance = recommandedforinsurance;
        return this;
    }
    
    @Override
     public BuildStep remark(String remark) {
        Objects.requireNonNull(remark);
        this.Remark = remark;
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
    private CopyOfBuilder(String id, String generatedReports, String insurerDetails, String nameofProposer, String date, String time, String placeofInspection, String vehicleRegdNo, String makeModel, String dateofRegdPurchase, String chassisNo, String engineNo, String miloMeter, String frtMudGuard, String fork, String handle, String speedometer, String fuelTank, String rearMudGuard, String silencer, String crankCase, String seats, String legGuard, String wheelRim, String headLamp, String tailLamp, String frtVisorCowl, String frtRhIndicator, String frtLhIndicator, String rearRhIndicator, String rearLhIndicator, String rhSideCover, String lhSideCover, String clutchBrakeLever, String tyre, String recommandedforinsurance, String remark) {
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
        .frtMudGuard(frtMudGuard)
        .fork(fork)
        .handle(handle)
        .speedometer(speedometer)
        .fuelTank(fuelTank)
        .rearMudGuard(rearMudGuard)
        .silencer(silencer)
        .crankCase(crankCase)
        .seats(seats)
        .legGuard(legGuard)
        .wheelRim(wheelRim)
        .headLamp(headLamp)
        .tailLamp(tailLamp)
        .frtVisorCowl(frtVisorCowl)
        .frtRhIndicator(frtRhIndicator)
        .frtLhIndicator(frtLhIndicator)
        .rearRhIndicator(rearRhIndicator)
        .rearLhIndicator(rearLhIndicator)
        .rhSideCover(rhSideCover)
        .lhSideCover(lhSideCover)
        .clutchBrakeLever(clutchBrakeLever)
        .tyre(tyre)
        .recommandedforinsurance(recommandedforinsurance)
        .remark(remark);
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
     public CopyOfBuilder frtMudGuard(String frtMudGuard) {
      return (CopyOfBuilder) super.frtMudGuard(frtMudGuard);
    }
    
    @Override
     public CopyOfBuilder fork(String fork) {
      return (CopyOfBuilder) super.fork(fork);
    }
    
    @Override
     public CopyOfBuilder handle(String handle) {
      return (CopyOfBuilder) super.handle(handle);
    }
    
    @Override
     public CopyOfBuilder speedometer(String speedometer) {
      return (CopyOfBuilder) super.speedometer(speedometer);
    }
    
    @Override
     public CopyOfBuilder fuelTank(String fuelTank) {
      return (CopyOfBuilder) super.fuelTank(fuelTank);
    }
    
    @Override
     public CopyOfBuilder rearMudGuard(String rearMudGuard) {
      return (CopyOfBuilder) super.rearMudGuard(rearMudGuard);
    }
    
    @Override
     public CopyOfBuilder silencer(String silencer) {
      return (CopyOfBuilder) super.silencer(silencer);
    }
    
    @Override
     public CopyOfBuilder crankCase(String crankCase) {
      return (CopyOfBuilder) super.crankCase(crankCase);
    }
    
    @Override
     public CopyOfBuilder seats(String seats) {
      return (CopyOfBuilder) super.seats(seats);
    }
    
    @Override
     public CopyOfBuilder legGuard(String legGuard) {
      return (CopyOfBuilder) super.legGuard(legGuard);
    }
    
    @Override
     public CopyOfBuilder wheelRim(String wheelRim) {
      return (CopyOfBuilder) super.wheelRim(wheelRim);
    }
    
    @Override
     public CopyOfBuilder headLamp(String headLamp) {
      return (CopyOfBuilder) super.headLamp(headLamp);
    }
    
    @Override
     public CopyOfBuilder tailLamp(String tailLamp) {
      return (CopyOfBuilder) super.tailLamp(tailLamp);
    }
    
    @Override
     public CopyOfBuilder frtVisorCowl(String frtVisorCowl) {
      return (CopyOfBuilder) super.frtVisorCowl(frtVisorCowl);
    }
    
    @Override
     public CopyOfBuilder frtRhIndicator(String frtRhIndicator) {
      return (CopyOfBuilder) super.frtRhIndicator(frtRhIndicator);
    }
    
    @Override
     public CopyOfBuilder frtLhIndicator(String frtLhIndicator) {
      return (CopyOfBuilder) super.frtLhIndicator(frtLhIndicator);
    }
    
    @Override
     public CopyOfBuilder rearRhIndicator(String rearRhIndicator) {
      return (CopyOfBuilder) super.rearRhIndicator(rearRhIndicator);
    }
    
    @Override
     public CopyOfBuilder rearLhIndicator(String rearLhIndicator) {
      return (CopyOfBuilder) super.rearLhIndicator(rearLhIndicator);
    }
    
    @Override
     public CopyOfBuilder rhSideCover(String rhSideCover) {
      return (CopyOfBuilder) super.rhSideCover(rhSideCover);
    }
    
    @Override
     public CopyOfBuilder lhSideCover(String lhSideCover) {
      return (CopyOfBuilder) super.lhSideCover(lhSideCover);
    }
    
    @Override
     public CopyOfBuilder clutchBrakeLever(String clutchBrakeLever) {
      return (CopyOfBuilder) super.clutchBrakeLever(clutchBrakeLever);
    }
    
    @Override
     public CopyOfBuilder tyre(String tyre) {
      return (CopyOfBuilder) super.tyre(tyre);
    }
    
    @Override
     public CopyOfBuilder recommandedforinsurance(String recommandedforinsurance) {
      return (CopyOfBuilder) super.recommandedforinsurance(recommandedforinsurance);
    }
    
    @Override
     public CopyOfBuilder remark(String remark) {
      return (CopyOfBuilder) super.remark(remark);
    }
  }
  
}
