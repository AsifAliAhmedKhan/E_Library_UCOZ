package com.cybersociety.elibraryucoz;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class Books_Selecter extends AppCompatActivity {

    boolean frun;
//    CheckBox chbscprgrmng;
//    CheckBox chmthfndmntl;
//    CheckBox chphysx;
//    CheckBox chintrocmptr;
//    CheckBox chislmyt;
   // CheckBox ;
    Button BtnSave;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subject_selecter);
        SharedPreferences sharedPreferences= PreferenceManager.getDefaultSharedPreferences(this);
        Intent i=new Intent(Books_Selecter.this,Selected_Books.class);
        BtnSave=findViewById(R.id.btnsave);
//---_Cs
        CheckBox    chbscprgrmng=findViewById(R.id.chbscprgrmng);
        CheckBox    chmthfndmntl=findViewById(R.id.chmthfndmntl);
        CheckBox    chphysx=findViewById(R.id.chphysx);
        CheckBox    chintrocmptr=findViewById(R.id.chintrocmptr);
        CheckBox    chislmyt =findViewById(R.id.chislmyt);
        CheckBox    chdld =findViewById(R.id.chdld);
        CheckBox    chicmnction =findViewById(R.id.chicmnction);
        CheckBox    chgraph_theory =findViewById(R.id.chgraph_theory);
        CheckBox    choop =findViewById(R.id.choop);
        CheckBox    chdmth =findViewById(R.id.chdmth);
        CheckBox    chpsyclgy =findViewById(R.id.chpsyclgy);
        CheckBox    chstats =findViewById(R.id.chstats);
        CheckBox    chos =findViewById(R.id.chos);
        CheckBox    chdda =findViewById(R.id.chdda);
        CheckBox    chandrodvlpmnt =findViewById(R.id.chandrodvlpmnt);
        CheckBox    chvcshrp =findViewById(R.id.chvcshrp);
        CheckBox    chEntrprnr =findViewById(R.id.chEntrprnr);
        CheckBox    chdbms =findViewById(R.id.chdbms);
////-------Edu
        CheckBox     chacdmicwrtngandrdng=findViewById(R.id.chacdmicwrtngandrdng);
        CheckBox     chclssrmmgmnt=findViewById(R.id.chclssrmmgmnt);
        CheckBox     chmotois=findViewById(R.id.chmotois);
        CheckBox     chpkstdy=findViewById(R.id.chpkstdy);
        CheckBox     chcntmrisuoedu=findViewById(R.id.chcntmrisuoedu);
        CheckBox     chtourdu=findViewById(R.id.chtourdu);
        CheckBox     chchlddvlpmnt=findViewById(R.id.chchlddvlpmnt);
        CheckBox     chartcrfnclgrfy=findViewById(R.id.chartcrfnclgrfy);
        CheckBox     chtopkstdy=findViewById(R.id.chtopkstdy);
        CheckBox     chQntitvrsrch=findViewById(R.id.chQntitvrsrch);
    //-__Economics


        CheckBox     chAcntig=findViewById(R.id.chAcntig);
        CheckBox     chir=findViewById(R.id.chir);
        CheckBox     chinfrlststc=findViewById(R.id.chinfrlststc);
        CheckBox     chmicroeconanlsis=findViewById(R.id.chmicroeconanlsis);
        CheckBox     chintrmdtmicroecon=findViewById(R.id.chintrmdtmicroecon);
        CheckBox     chprncplofmacrec=findViewById(R.id.chprncplofmacrec);CheckBox     chintrosocio=findViewById(R.id.chintrosocio);
        CheckBox     chbsceconmtrcs=findViewById(R.id.chbsceconmtrcs);
        CheckBox     chmntrytheornplcy=findViewById(R.id.chmntrytheornplcy);
        CheckBox     chfnnclinsnmrkts=findViewById(R.id.chfnnclinsnmrkts);
        CheckBox     chpltclecnmy=findViewById(R.id.chpltclecnmy);
        CheckBox     chpblcfnnce=findViewById(R.id.chpblcfnnce);
        CheckBox     chenvrmntlecn=findViewById(R.id.chenvrmntlecn);
     /////--ba------------
        CheckBox     chprncleofmngmnt=findViewById(R.id.chprncleofmngmnt);
        CheckBox     chcstacnting=findViewById(R.id.chcstacnting);
        CheckBox     chbsnscmnction=findViewById(R.id.chbsnscmnction);
        CheckBox     chmrktigmngmnt=findViewById(R.id.chmrktigmngmnt);
        CheckBox     chfnncialmngmnt=findViewById(R.id.chfnncialmngmnt);

        CheckBox     chfnnclstatmntanlyss=findViewById(R.id.chfnnclstatmntanlyss);
        CheckBox     chcrprtfnnce=findViewById(R.id.chcrprtfnnce);
        CheckBox     chhrm=findViewById(R.id.chhrm);
      //  CheckBox     =findViewById(R.id.);


        if(sharedPreferences.getBoolean("fstart",true)){

        BtnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor=sharedPreferences.edit();
                editor.putBoolean("fstart",false);
                ////--------CS
                editor.putBoolean("chbscprgrmng",chbscprgrmng.isChecked());
                editor.putBoolean("chmthfndmntl",chmthfndmntl.isChecked());
                editor.putBoolean("chphysx",chphysx.isChecked());
                editor.putBoolean("chintrocmptr",chintrocmptr.isChecked());editor.putBoolean("chislmyt",chislmyt.isChecked());
               editor.putBoolean("chdld",chdld.isChecked());
               editor.putBoolean("chicmnction",chicmnction.isChecked());
               editor.putBoolean("chgraph_theory",chgraph_theory.isChecked());
               editor.putBoolean("choop",choop.isChecked());
               editor.putBoolean("chdmth",chdmth.isChecked());
               editor.putBoolean("chpsyclgy",chpsyclgy.isChecked());
               editor.putBoolean("chstats",chstats.isChecked());
               editor.putBoolean("chos",chos.isChecked());
               editor.putBoolean("chdbms",chdbms.isChecked());
               editor.putBoolean("chdda",chdda.isChecked());
               editor.putBoolean("chEntrprnr",chEntrprnr.isChecked());
               editor.putBoolean("chandrodvlpmnt",chandrodvlpmnt.isChecked());
               editor.putBoolean("chvcshrp",chvcshrp.isChecked());
               editor.putBoolean("chvcshrp",chvcshrp.isChecked());

               ////------Education
                editor.putBoolean("chacdmicwrtngandrdng",chacdmicwrtngandrdng.isChecked());
                editor.putBoolean("chclssrmmgmnt",chclssrmmgmnt.isChecked());
                editor.putBoolean("chmotois",chmotois.isChecked());
                editor.putBoolean("chpkstdy",chpkstdy.isChecked());

                editor.putBoolean("chcntmrisuoedu",chcntmrisuoedu.isChecked());
                editor.putBoolean("chtourdu",chtourdu.isChecked());
                editor.putBoolean("chchlddvlpmnt",chchlddvlpmnt.isChecked());
                editor.putBoolean("chartcrfnclgrfy",chartcrfnclgrfy.isChecked());
                editor.putBoolean("chtopkstdy",chtopkstdy.isChecked());
                editor.putBoolean("chQntitvrsrch",chQntitvrsrch.isChecked());
              //------Economics


                editor.putBoolean("chAcntig",chAcntig.isChecked());
                editor.putBoolean("chir",chir.isChecked());
                editor.putBoolean("chinfrlststc",chinfrlststc.isChecked());
                editor.putBoolean("chmicroeconanlsis",chmicroeconanlsis.isChecked());
                editor.putBoolean("chintrmdtmicroecon",chintrmdtmicroecon.isChecked());
                editor.putBoolean("chprncplofmacrec",chprncplofmacrec.isChecked());
                editor.putBoolean("chintrosocio",chintrosocio.isChecked());
                editor.putBoolean("chbsceconmtrcs",chbsceconmtrcs.isChecked());
                editor.putBoolean("chmntrytheornplcy",chmntrytheornplcy.isChecked());
                editor.putBoolean("chfnnclinsnmrkts",chfnnclinsnmrkts.isChecked());
                editor.putBoolean("chpltclecnmy",chpltclecnmy.isChecked());
                editor.putBoolean("chpblcfnnce",chpblcfnnce.isChecked());
                editor.putBoolean("chenvrmntlecn",chenvrmntlecn.isChecked());

                //----------ba-----------------
                editor.putBoolean("chprncleofmngmnt",chprncleofmngmnt.isChecked());
                editor.putBoolean("chcstacnting",chcstacnting.isChecked());
                editor.putBoolean("chbsnscmnction",chbsnscmnction.isChecked());
                editor.putBoolean("chmrktigmngmnt",chmrktigmngmnt.isChecked());
                editor.putBoolean("chfnncialmngmnt",chfnncialmngmnt.isChecked());
                editor.putBoolean("chfnnclstatmntanlyss",chfnnclstatmntanlyss.isChecked());
                editor.putBoolean("chcrprtfnnce",chcrprtfnnce.isChecked());
                editor.putBoolean("chhrm",chhrm.isChecked());
               // editor.putBoolean("",.isChecked());

                editor.apply();
                startActivity(i);
            }
        });
        }else {  startActivity(i);}
    }
}