package com.example.surveyx;

import android.app.Application;
import android.app.IntentService;
import android.util.Log;

import com.amplifyframework.AmplifyException;
import com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin;
import com.amplifyframework.core.Amplify;
import com.amplifyframework.datastore.AWSDataStorePlugin;
import com.amplifyframework.datastore.generated.model.Inspection;
import com.amplifyframework.datastore.generated.model.Inspectionfour;
import com.amplifyframework.datastore.generated.model.User;
import com.amplifyframework.storage.s3.AWSS3StoragePlugin;

import java.nio.file.attribute.PosixFileAttributes;

public class MyAmplifyApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();


        try {
            Amplify.addPlugin(new AWSCognitoAuthPlugin());
            Amplify.addPlugin(new AWSS3StoragePlugin());
            Amplify.addPlugin(new AWSDataStorePlugin());

            Amplify.configure(getApplicationContext());
 Log.i("MyAmplifyApp", "Initialized Amplify");
        } catch (AmplifyException error) {
            Log.e("MyAmplifyApp", "Could not initialize Amplify", error);
        }
        User post = User.builder().name("p").email("qw").phone("hg").profile("55").build();
        Amplify.DataStore.save(post,
                result -> Log.i("MyAmplifyApp", "Created a new post successfully"),
                error -> Log.e("MyAmplifyApp",  "Error creating post", error)
        );

       Inspection item =Inspection.builder().generatedReports("1").insurerDetails("2").nameofProposer("3").date("4").time("5").placeofInspection("6").vehicleRegdNo("7").makeModel("8")
                .dateofRegdPurchase("45").chassisNo("45").engineNo("45").miloMeter("47").frtMudGuard("45").fork("25").handle("10")
                        .speedometer("74").fuelTank("74").rearMudGuard("14").silencer("747").crankCase("47").seats("12").legGuard("").wheelRim("14")
                        .headLamp("425").tailLamp("1014").frtVisorCowl("101").frtRhIndicator("414").frtLhIndicator("74").rearRhIndicator("47")
                        .rearLhIndicator("1425").rhSideCover("1425").lhSideCover("1452").clutchBrakeLever("748").tyre("1425").recommandedforinsurance("1425").remark("ohkkk")
                        .build();
        Amplify.DataStore.save(
                item,
                success -> Log.i("Amplify", "Saved item: " + success.item().getId()),
                error -> Log.e("Amplify", "Could not save item to DataStore", error)
        );
        Inspectionfour inspectionfour=Inspectionfour.builder().generatedReports("").insurerDetails("").nameofProposer("").date("").time("").placeofInspection("").vehicleRegdNo("").makeModel("")
                .dateofRegdPurchase("").chassisNo("").engineNo("").miloMeter("").roof("").bonnet("").lhFender("").lhFrtDoor("").lhRearDoor("").lhQtrPanel("").lhSideBody("").dicky("").rhFender("")
                .rhFrtDoor("").rhRearDoor("").rhQtrPanel("").rhSideBody("").frontBumper("").rearBumper("").frtWsGlass("").lhFrtDoorGlass("").lhRearDoorGlass("").rhFrtDoorGlass("").rhRearDoorGlass("").rhQtrGlass("")
                .lhQtrGlass("").dickyGlass("").headLamps("").tailLamps("").tyreWheel("").rearViewMirror("").dashBoardIPanel("").eleAccessories("").nonEleAccessories("").recommendedForInsurance("").remarks("").build();
        Amplify.DataStore.save(inspectionfour,
                result -> Log.i("MyAmplifyApp", "Created a new post successfully"),
                error -> Log.e("MyAmplifyApp",  "Error creating post", error)
        );
    }
}
