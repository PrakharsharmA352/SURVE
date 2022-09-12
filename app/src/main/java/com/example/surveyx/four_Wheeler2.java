package com.example.surveyx;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.util.ArrayList;

public class four_Wheeler2 extends AppCompatActivity {
    private Button next;
    ArrayList<String> numbers1 = new ArrayList<>();
private RadioGroup Roof_rg,Bonnet_rg,LhFender_rg,LhFrtDoor_rg,LhRearDoor_rg,LhQtrPanel_rg,LhSideBody_rg,Dicky_rg,RhFender_rg,RhFrtDoor_rg,RhRearDoor_rg,
        RhQtrPanel_rg,RhSideBody_rg,FrontBumper_rg,RearBumper_rg,FrtWSGlass_rg,LhFrtDoorGlass_rg,LhRearDoorGlass_rg,RhFrtDoorGlass_rg,RhRearDoorGlass_rg,
        RhQtrGlass_rg,LhQtrGlass_rg,DickyGlass_rg,HeadLamps_rg,TailLamps_rg,TyreWheel_rg,RearViewMirror_rg,DashBoardIPanel_rg,RecommendedForInsurance_rg;
private RadioButton Roof_rd,Bonnet_rd,LhFender_rd,LhFrtDoor_rd,LhRearDoor_rd,LhQtrPanel_rd,LhSideBody_rd,Dicky_rd,RhFender_rd,RhFrtDoor_rd,RhRearDoor_rd,
        RhQtrPanel_rd,RhSideBody_rd,FrontBumper_rd,RearBumper_rd,FrtWSGlass_rd,LhFrtDoorGlass_rd,LhRearDoorGlass_rd,RhFrtDoorGlass_rd,RhRearDoorGlass_rd,
        RhQtrGlass_rd,LhQtrGlass_rd,DickyGlass_rd,HeadLamps_rd,TailLamps_rd,TyreWheel_rd,RearViewMirror_rd,DashBoardIPanel_rd,RecommendedForInsurance_rd;
private EditText remark,NonEle_Accessories,Ele_Accessories;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four_wheeler2);
        next=(Button) findViewById(R.id.gotot3);
        Roof_rg=findViewById(R.id.Roof_rg);
        Bonnet_rg=findViewById(R.id.Bonnet_rg);
        LhFender_rg=findViewById(R.id.LhFender_rg);
        LhFrtDoor_rg=findViewById(R.id.LhFrtDoor_rg);
        LhRearDoor_rg=findViewById(R.id.LhRearDoor_rg);
        LhQtrPanel_rg =findViewById(R.id.LhQtrPanel_rg);
        LhSideBody_rg=findViewById(R.id.LhSideBody_rg);
        Dicky_rg=findViewById(R.id.Dicky_rg);
        RhFender_rg=findViewById(R.id.RhFender_rg);
        RhFrtDoor_rg=findViewById(R.id.RhFrtDoor_rg);
        RhRearDoor_rg=findViewById(R.id.RhRearDoor_rg);
        RhQtrPanel_rg=findViewById(R.id.RhQtrPanel_rg);
        RhSideBody_rg=findViewById(R.id.RhSideBody_rg);
        FrontBumper_rg=findViewById(R.id.FrontBumper_rg);
        RearBumper_rg=findViewById(R.id.RearBumper_rg);
        FrtWSGlass_rg=findViewById(R.id.FrtWSGlass_rg);
        LhFrtDoorGlass_rg=findViewById(R.id.LhFrtDoorGlass_rg);
        LhRearDoorGlass_rg=findViewById(R.id.LhRearDoorGlass_rg);
        RhFrtDoorGlass_rg=findViewById(R.id.RhFrtDoorGlass_rg);
        RhRearDoorGlass_rg=findViewById(R.id.RhRearDoorGlass_rg);
        RhQtrGlass_rg=findViewById(R.id.RhQtrGlass_rg);
        LhQtrGlass_rg=findViewById(R.id.LhQtrGlass_rg);
        DickyGlass_rg=findViewById(R.id.DickyGlass_rg);
        HeadLamps_rg=findViewById(R.id.HeadLamps_rg);
        TailLamps_rg=findViewById(R.id.TailLamps_rg);
        TyreWheel_rg=findViewById(R.id.TyreWheel_rg);
        RearViewMirror_rg=findViewById(R.id.RearViewMirror_rg);
        DashBoardIPanel_rg=findViewById(R.id.DashBoardIPanel_rg);
        RecommendedForInsurance_rg=findViewById(R.id.RecommendedForInsurance_rg);
        remark=findViewById(R.id.remark);
        NonEle_Accessories=findViewById(R.id.NonEle_Accessories);
        Ele_Accessories=findViewById(R.id.EleAccessories);
        ArrayList<String> numbersList = (ArrayList<String>) getIntent().getSerializableExtra("key");
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              /*   Log.i("val",String.valueOf(numbersList));
                Intent next=new Intent(getApplicationContext(),four_wheeler3.class);
                startActivity(next);*/
                int Roof_id = Roof_rg.getCheckedRadioButtonId();
                Roof_rd= (RadioButton) findViewById(Roof_id);
                if(Roof_id==-1){
                    Toast.makeText(four_Wheeler2.this,"Nothing selected",Toast.LENGTH_SHORT).show();
                }
                else{
                    numbers1.add(Roof_rd.getText().toString());
                }
                //
                int Bonnet_id = Bonnet_rg.getCheckedRadioButtonId();
                Bonnet_rd= (RadioButton) findViewById(Bonnet_id);
                if(Bonnet_id==-1){
                    Toast.makeText(four_Wheeler2.this,"Nothing selected", Toast.LENGTH_SHORT).show();
                }
                else{
                    numbers1.add(Bonnet_rd.getText().toString());
                }
                //
                int LhFender_id = LhFender_rg.getCheckedRadioButtonId();
                LhFender_rd= (RadioButton) findViewById(LhFender_id);
                if(LhFender_id==-1){
                    Toast.makeText(four_Wheeler2.this,"Nothing selected", Toast.LENGTH_SHORT).show();
                }
                else{
                    numbers1.add(LhFender_rd.getText().toString());
                }
             //?
                int LhFrtDoor_id = LhFrtDoor_rg.getCheckedRadioButtonId();
                LhFrtDoor_rd= (RadioButton) findViewById(LhFrtDoor_id);
                if(LhFrtDoor_id==-1){
                    Toast.makeText(four_Wheeler2.this,"Nothing selected", Toast.LENGTH_SHORT).show();
                }
                else{
                    numbers1.add(LhFrtDoor_rd.getText().toString());
                }
                //?1
                int LhRearDoor_id = LhRearDoor_rg.getCheckedRadioButtonId();
                LhRearDoor_rd= (RadioButton) findViewById(LhRearDoor_id);
                if(LhRearDoor_id==-1){
                    Toast.makeText(four_Wheeler2.this,"Nothing selected", Toast.LENGTH_SHORT).show();
                }
                else{
                    numbers1.add(LhRearDoor_rd.getText().toString());
                }
                //?2
                int LhQtrPanel_id = LhQtrPanel_rg.getCheckedRadioButtonId();
                LhQtrPanel_rd= (RadioButton) findViewById(LhQtrPanel_id);
                if(LhQtrPanel_id==-1){
                    Toast.makeText(four_Wheeler2.this,"Nothing selected", Toast.LENGTH_SHORT).show();
                }
                else{
                    numbers1.add(LhQtrPanel_rd.getText().toString());
                }
                //?3
                int LhSideBody_id = LhSideBody_rg.getCheckedRadioButtonId();
                LhSideBody_rd= (RadioButton) findViewById(LhSideBody_id);
                if(LhSideBody_id==-1){
                    Toast.makeText(four_Wheeler2.this,"Nothing selected", Toast.LENGTH_SHORT).show();
                }
                else{
                    numbers1.add(LhSideBody_rd.getText().toString());
                }
                //?4
                int Dicky_id= Dicky_rg.getCheckedRadioButtonId();
                Dicky_rd= (RadioButton) findViewById(Dicky_id);
                if(Dicky_id==-1){
                    Toast.makeText(four_Wheeler2.this,"Nothing selected", Toast.LENGTH_SHORT).show();
                }
                else{
                    numbers1.add(Dicky_rd.getText().toString());
                }
                //?5
                int RhFender_id= RhFender_rg.getCheckedRadioButtonId();
                RhFender_rd= (RadioButton) findViewById(RhFender_id);
                if(RhFender_id==-1){
                    Toast.makeText(four_Wheeler2.this,"Nothing selected", Toast.LENGTH_SHORT).show();
                }
                else{
                    numbers1.add(RhFender_rd.getText().toString());
                }
                //?6
                int RhFrtDoor_id= RhFrtDoor_rg.getCheckedRadioButtonId();
                RhFrtDoor_rd= (RadioButton) findViewById(RhFrtDoor_id);
                if(RhFrtDoor_id==-1){
                    Toast.makeText(four_Wheeler2.this,"Nothing selected", Toast.LENGTH_SHORT).show();
                }
                else{
                    numbers1.add(RhFrtDoor_rd.getText().toString());
                }
                //?7
                int RhRearDoor_id= RhRearDoor_rg.getCheckedRadioButtonId();
                RhRearDoor_rd= (RadioButton) findViewById(RhRearDoor_id);
                if(RhRearDoor_id==-1){
                    Toast.makeText(four_Wheeler2.this,"Nothing selected", Toast.LENGTH_SHORT).show();
                }
                else{
                    numbers1.add(RhRearDoor_rd.getText().toString());
                }
                //?8
                int RhQtrPanel_id= RhQtrPanel_rg.getCheckedRadioButtonId();
                RhQtrPanel_rd= (RadioButton) findViewById(RhQtrPanel_id);
                if(RhRearDoor_id==-1){
                    Toast.makeText(four_Wheeler2.this,"Nothing selected", Toast.LENGTH_SHORT).show();
                }
                else{
                    numbers1.add(RhQtrPanel_rd.getText().toString());
                }

            //?9
            int RhSideBody_id= RhSideBody_rg.getCheckedRadioButtonId();
            RhSideBody_rd=(RadioButton) findViewById(RhSideBody_id);
                if(RhSideBody_id==-1){
                Toast.makeText(four_Wheeler2.this,"Nothing selected", Toast.LENGTH_SHORT).show();
            }
                else{
                numbers1.add(RhSideBody_rd.getText().toString());
            }
                //?10 done at RhsideBody
                int FrontBumper_id= FrontBumper_rg.getCheckedRadioButtonId();
            FrontBumper_rd= (RadioButton) findViewById(FrontBumper_id);
                if(FrontBumper_id==-1){
                Toast.makeText(four_Wheeler2.this,"Nothing selected", Toast.LENGTH_SHORT).show();
            }
                else{
                numbers1.add(FrontBumper_rd.getText().toString());
            }
            int RearBumper_id= RearBumper_rg.getCheckedRadioButtonId();
            RearBumper_rd= (RadioButton) findViewById(RearBumper_id);
                if(RearBumper_id==-1){
                Toast.makeText(four_Wheeler2.this,"Nothing selected", Toast.LENGTH_SHORT).show();
            }
                else{
                numbers1.add(RearBumper_rd.getText().toString());
            }
                //??complete at rear bumper
            int FrtWSGlass_id= FrtWSGlass_rg.getCheckedRadioButtonId();
            FrtWSGlass_rd= (RadioButton) findViewById(FrtWSGlass_id);
                if(FrtWSGlass_id==-1){
                Toast.makeText(four_Wheeler2.this,"Nothing selected", Toast.LENGTH_SHORT).show();
            }
                else{
                numbers1.add(FrtWSGlass_rd.getText().toString());
            }
            int LhFrtDoorGlass_id= LhFrtDoorGlass_rg.getCheckedRadioButtonId();
            LhFrtDoorGlass_rd= (RadioButton) findViewById(LhFrtDoorGlass_id);
                if(LhFrtDoorGlass_id==-1){
                Toast.makeText(four_Wheeler2.this,"Nothing selected", Toast.LENGTH_SHORT).show();
            }
                else{
                numbers1.add(LhFrtDoorGlass_rd.getText().toString());
            }
            int LhRearDoorGlass_id= LhRearDoorGlass_rg.getCheckedRadioButtonId();
            LhRearDoorGlass_rd= (RadioButton) findViewById(LhRearDoorGlass_id);
                if(LhRearDoorGlass_id==-1){
                Toast.makeText(four_Wheeler2.this,"Nothing selected", Toast.LENGTH_SHORT).show();
            }
                else{
                numbers1.add(LhRearDoorGlass_rd.getText().toString());
            }
                //complete at lHRearDoorGlasss
              /*  int LhRearDoorGlass_id= LhRearDoorGlass_rg.getCheckedRadioButtonId();
            LhRearDoorGlass_rd= (RadioButton) findViewById(LhRearDoorGlass_id);
                if(LhRearDoorGlass_id==-1){
                Toast.makeText(four_Wheeler2.this,"Nothing selected", Toast.LENGTH_SHORT).show();
            }
                else{
                numbers1.add(LhRearDoorGlass_rd.getText().toString());
            }*/
            int RhFrtDoorGlass_id= RhFrtDoorGlass_rg.getCheckedRadioButtonId();
            RhFrtDoorGlass_rd= (RadioButton) findViewById(RhFrtDoorGlass_id);
                if(RhFrtDoorGlass_id==-1){
                Toast.makeText(four_Wheeler2.this,"Nothing selected", Toast.LENGTH_SHORT).show();
            }
                else{
                numbers1.add(RhFrtDoorGlass_rd.getText().toString());
            }
            int RhRearDoorGlass_id= RhRearDoorGlass_rg.getCheckedRadioButtonId();
            RhRearDoorGlass_rd= (RadioButton) findViewById(RhRearDoorGlass_id);
                if(RhRearDoorGlass_id==-1){
                Toast.makeText(four_Wheeler2.this,"Nothing selected", Toast.LENGTH_SHORT).show();
            }
                else{
                numbers1.add(RhRearDoorGlass_rd.getText().toString());
            }
            int RhQtrGlass_id= RhQtrGlass_rg.getCheckedRadioButtonId();
            RhQtrGlass_rd= (RadioButton) findViewById(RhQtrGlass_id);
                if(RhQtrGlass_id==-1){
                Toast.makeText(four_Wheeler2.this,"Nothing selected", Toast.LENGTH_SHORT).show();
            }
                else{
                numbers1.add(RhQtrGlass_rd.getText().toString());
            }
            int LhQtrGlass_id=LhQtrGlass_rg.getCheckedRadioButtonId();
            LhQtrGlass_rd= (RadioButton) findViewById(LhQtrGlass_id);
                if(LhQtrGlass_id==-1){
                Toast.makeText(four_Wheeler2.this,"Nothing selected", Toast.LENGTH_SHORT).show();
            }
                else{
                numbers1.add(LhQtrGlass_rd.getText().toString());
            }
                ///complete at LhQtrGlass
                int DickyGlass_id=DickyGlass_rg.getCheckedRadioButtonId();
            DickyGlass_rd= (RadioButton) findViewById(DickyGlass_id);
                if(DickyGlass_id==-1){
                Toast.makeText(four_Wheeler2.this,"Nothing selected", Toast.LENGTH_SHORT).show();
            }
                else{
                numbers1.add(DickyGlass_rd.getText().toString());
            }
            int HeadLamps_id=HeadLamps_rg.getCheckedRadioButtonId();
            HeadLamps_rd= (RadioButton) findViewById(HeadLamps_id);
                if(HeadLamps_id==-1){
                Toast.makeText(four_Wheeler2.this,"Nothing selected", Toast.LENGTH_SHORT).show();
            }
                else{
                numbers1.add(HeadLamps_rd.getText().toString());
            }
            int TailLamps_id=TailLamps_rg.getCheckedRadioButtonId();
            TailLamps_rd= (RadioButton) findViewById(TailLamps_id);
                if(TailLamps_id==-1){
                Toast.makeText(four_Wheeler2.this,"Nothing selected", Toast.LENGTH_SHORT).show();
            }
                else{
                numbers1.add(TailLamps_rd.getText().toString());
            }
            int TyreWheel_id=TyreWheel_rg.getCheckedRadioButtonId();
            TyreWheel_rd= (RadioButton) findViewById(TyreWheel_id);
                if(TyreWheel_id==-1){
                Toast.makeText(four_Wheeler2.this,"Nothing selected", Toast.LENGTH_SHORT).show();
            }
                else{
                numbers1.add(TyreWheel_rd.getText().toString());
            }
            int RearViewMirror_id=RearViewMirror_rg.getCheckedRadioButtonId();
            RearViewMirror_rd= (RadioButton) findViewById(RearViewMirror_id);
                if(RearViewMirror_id==-1){
                Toast.makeText(four_Wheeler2.this,"Nothing selected", Toast.LENGTH_SHORT).show();
            }
                else{
                numbers1.add(RearViewMirror_rd.getText().toString());
            }
                ///Complete at LHQTRGLASS

            int DashBoardIPanel_id=DashBoardIPanel_rg.getCheckedRadioButtonId();
            DashBoardIPanel_rd= (RadioButton) findViewById(DashBoardIPanel_id);
                if(DashBoardIPanel_id==-1){
                Toast.makeText(four_Wheeler2.this,"Nothing selected", Toast.LENGTH_SHORT).show();
            }
                else{
                numbers1.add(DashBoardIPanel_rd.getText().toString());
            }
                numbers1.add(Ele_Accessories.getText().toString());
                numbers1.add(NonEle_Accessories.getText().toString());
            int RecommendedForInsurance_id=RecommendedForInsurance_rg.getCheckedRadioButtonId();
            RecommendedForInsurance_rd= (RadioButton) findViewById(RecommendedForInsurance_id);
                if(RecommendedForInsurance_id==-1){
                Toast.makeText(four_Wheeler2.this,"Nothing selected", Toast.LENGTH_SHORT).show();
            }
                else{
                numbers1.add(RecommendedForInsurance_rd.getText().toString());
            }
                numbers1.add(remark.getText().toString());
            Intent next=new Intent(getApplicationContext(),four_wheeler3.class);
                next.putExtra("key1", numbers1);
                next.putExtra("key",numbersList);
            startActivity(next);
        }
        });
    }
}