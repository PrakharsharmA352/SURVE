package com.example.surveyx;

import android.app.Application;
import android.app.IntentService;
import android.util.Log;

import com.amplifyframework.AmplifyException;
import com.amplifyframework.core.Amplify;
import com.amplifyframework.datastore.AWSDataStorePlugin;
import com.amplifyframework.datastore.generated.model.Inspection;
import com.amplifyframework.datastore.generated.model.User;

import java.nio.file.attribute.PosixFileAttributes;

public class MyAmplifyApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        try {
            Amplify.addPlugin(new AWSDataStorePlugin());
            Amplify.configure(getApplicationContext());

            Log.i("MyAmplifyApp", "Initialized Amplify");
        } catch (AmplifyException error) {
            Log.e("MyAmplifyApp", "Could not initialize Amplify", error);
        }
        User post = User.builder().name("p").email("qw").phone("hg").profile("55").build();
                /*Post.builder()
                .title("Create an Amplify DataStore app")
                .status(PostStatus.ACTIVE)
                .build();*/

        Amplify.DataStore.save(post,
                result -> Log.i("MyAmplifyApp", "Created a new post successfully"),
                error -> Log.e("MyAmplifyApp",  "Error creating post", error)
        );

        Inspection inspection =Inspection.builder().generatedReports("").insurerDetails("").nameofProposer("").date("").time("").placeofInspection("").vehicleRegdNo("").makeModel("")
                .dateofRegdPurchase("").chassisNo("").engineNo("").miloMeter("").frtMudGuard("").fork("").handle("")
                        .speedometer("").fuelTank("").rearMudGuard("").silencer("").crankCase("").seats("").legGuard("").wheelRim("")
                        .headLamp("").tailLamp("").frtVisorCowl("").frtRhIndicator("").frtLhIndicator("").rearRhIndicator("")
                        .rearLhIndicator("").rhSideCover("").lhSideCover("").clutchBrakeLever("").tyre("").remark("").recommandedforinsurance("")
                        .build();
        Amplify.DataStore.save(inspection,
                result -> Log.i("MyAmplifyApp", "Created a new post successfully"),
                error -> Log.e("MyAmplifyApp",  "Error creating post", error)
        );
    }
}
