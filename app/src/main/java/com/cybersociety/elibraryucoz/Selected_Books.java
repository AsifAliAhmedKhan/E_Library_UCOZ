package com.cybersociety.elibraryucoz;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.app.Application;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.method.LinkMovementMethod;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class Selected_Books extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selected_books);
        SharedPreferences mSharedprefs= PreferenceManager.getDefaultSharedPreferences(this);



//------Cs
        CardView    crdismyt=findViewById(R.id.islmyt1);
        CardView    crdintrocmptr=findViewById(R.id.crdintrocmptr);
        CardView    crdbscprgrmng=findViewById(R.id.crdbscprgrmng);
        CardView    crdmthfndmntl =findViewById(R.id.crdmthfndmntl);
        CardView    crdphysx=findViewById(R.id.crdphysx);
        CardView    crddld=findViewById(R.id.crddld);
        CardView    crdcmnction=findViewById(R.id.crdcmnction);
        CardView    crdgraph_theory=findViewById(R.id.crdgraph_theory);
        CardView    crdoop=findViewById(R.id.crdoop);
        CardView    crddmth=findViewById(R.id.crddmth);
        CardView    crdpsyclgy=findViewById(R.id.crdpsyclgy);
        CardView    crdstats=findViewById(R.id.crdstats);
        CardView    crdos=findViewById(R.id.crdos);
        CardView    crddbms=findViewById(R.id.crddbms);
         CardView   crddda=findViewById(R.id.crddda);
        CardView   crdandrodvlpmnt=findViewById(R.id.crdandrodvlpmnt);
        CardView   crdvcshrp=findViewById(R.id.crdvcshrp);
        CardView   crdEntrprnr=findViewById(R.id.crdEntrprnr);

//------Edu---
        CardView   cardacdmicwrtngandrdng=findViewById(R.id.cardacdmicwrtngandrdng);
        CardView   cardclssrmmgmnt=findViewById(R.id.cardclssrmmgmnt);
        CardView   cardmotois=findViewById(R.id.cardmotois);
        CardView   cardpkstdy=findViewById(R.id.cardpkstdy);
        CardView   cardcntmrisuoedu=findViewById(R.id.cardcntmrisuoedu);
        CardView   cardtourdu=findViewById(R.id.cardtourdu);
        CardView   cardchlddvlpmnt=findViewById(R.id.cardchlddvlpmnt);
        CardView   cardartcrfnclgrfy=findViewById(R.id.cardartcrfnclgrfy);
        CardView   cardtopkstdy=findViewById(R.id.cardtopkstdy);
        CardView   cardQntitvrsrch=findViewById(R.id.cardQntitvrsrch);

        //---Economics

        CardView   cardAcntig=findViewById(R.id.cardAcntig);
        CardView   cardir=findViewById(R.id.cardir);
        CardView   cardinfrlststc=findViewById(R.id.cardinfrlststc);
        CardView   cardmicroeconanlsis=findViewById(R.id.cardmicroeconanlsis);
        CardView   cardintrmdtmicroecon=findViewById(R.id.cardintrmdtmicroecon);
        CardView   cardintrosocio=findViewById(R.id.cardintrosocio);
        CardView   cardprncplofmacrec=findViewById(R.id.cardprncplofmacrec);
        CardView   cardbsceconmtrcs=findViewById(R.id.cardbsceconmtrcs);
        CardView   cardmntrytheornplcy=findViewById(R.id.cardmntrytheornplcy);
        CardView   cardfnnclinsnmrkts=findViewById(R.id.cardfnnclinsnmrkts);
        CardView   cardpblcfnnce=findViewById(R.id.cardpblcfnnce);
        CardView   cardpltclecnmy=findViewById(R.id.cardpltclecnmy);
        CardView   cardenvrmntlecn=findViewById(R.id.cardenvrmntlecn);

      //--------ba-------------------
        CardView   cardcstacnting=findViewById(R.id.cardcstacnting);
        CardView   cardprncleofmngmnt=findViewById(R.id.cardprncleofmngmnt);
        CardView   cardbsnscmnction=findViewById(R.id.cardbsnscmnction);
        CardView   cardmrktigmngmnt=findViewById(R.id.cardmrktigmngmnt);
        CardView   cardfnncialmngmnt=findViewById(R.id.cardfnncialmngmnt);
        CardView   cardfnnclstatmntanlyss=findViewById(R.id.cardfnnclstatmntanlyss);
        CardView   cardcrprtfnnce=findViewById(R.id.cardcrprtfnnce);
        CardView   cardhrm=findViewById(R.id.cardhrm);
        //CardView   card=findViewById(R.id.card);





///----CS
        crdismyt.setVisibility(View.GONE);
        crdintrocmptr.setVisibility(View.GONE);
        crdbscprgrmng.setVisibility(View.GONE);
        crdmthfndmntl.setVisibility(View.GONE);
        crdphysx.setVisibility(View.GONE);
        crddld.setVisibility(View.GONE);
        crdcmnction.setVisibility(View.GONE);
        crdgraph_theory .setVisibility(View.GONE);
        crdoop.setVisibility(View.GONE);
        crddmth.setVisibility(View.GONE);
        crdpsyclgy.setVisibility(View.GONE);
        crdstats.setVisibility(View.GONE);
        crdos.setVisibility(View.GONE);
        crddbms.setVisibility(View.GONE);
         crddda .setVisibility(View.GONE);
        crdandrodvlpmnt .setVisibility(View.GONE);
        crdvcshrp .setVisibility(View.GONE);
        crdEntrprnr .setVisibility(View.GONE);
        //--------Edu---

        cardacdmicwrtngandrdng .setVisibility(View.GONE);
        cardclssrmmgmnt .setVisibility(View.GONE);
        cardmotois .setVisibility(View.GONE);
        cardpkstdy .setVisibility(View.GONE);
        cardtourdu.setVisibility(View.GONE);
        cardcntmrisuoedu.setVisibility(View.GONE);
        cardchlddvlpmnt.setVisibility(View.GONE);
        cardartcrfnclgrfy.setVisibility(View.GONE);
        cardtopkstdy.setVisibility(View.GONE);
        cardQntitvrsrch.setVisibility(View.GONE);

        //---Economics
        cardAcntig.setVisibility(View.GONE);
        cardir.setVisibility(View.GONE);
        cardinfrlststc.setVisibility(View.GONE);
        cardmicroeconanlsis.setVisibility(View.GONE);
        cardintrmdtmicroecon.setVisibility(View.GONE);
        cardprncplofmacrec.setVisibility(View.GONE);
        cardintrosocio.setVisibility(View.GONE);
        cardbsceconmtrcs.setVisibility(View.GONE);
        cardmntrytheornplcy.setVisibility(View.GONE);
        cardfnnclinsnmrkts.setVisibility(View.GONE);
        cardpltclecnmy.setVisibility(View.GONE);
        cardpblcfnnce.setVisibility(View.GONE);
        cardenvrmntlecn.setVisibility(View.GONE);
       //--------ba--------
        cardcstacnting.setVisibility(View.GONE);
        cardprncleofmngmnt.setVisibility(View.GONE);
        cardbsnscmnction.setVisibility(View.GONE);
        cardmrktigmngmnt.setVisibility(View.GONE);
        cardfnncialmngmnt.setVisibility(View.GONE);
        cardfnnclstatmntanlyss.setVisibility(View.GONE);
        cardcrprtfnnce.setVisibility(View.GONE);
        cardhrm.setVisibility(View.GONE);



//Declaration
        //-----CS--
        TextView physx=findViewById(R.id.physx);
        TextView mthfndmntl=findViewById(R.id.mthfndmntl);
        TextView introcmptr=findViewById(R.id.introcmptr);
        TextView bscprgrmng=findViewById(R.id.bscprgrmng);
        TextView islmyt=findViewById(R.id.islmyt);
        TextView dld=findViewById(R.id.dld);
        TextView cmnction=findViewById(R.id.cmnction);
        TextView graph_theory=findViewById(R.id.graph_theory);
        TextView oop=findViewById(R.id.oop);
        TextView dmth=findViewById(R.id.dmth);
        TextView os=findViewById(R.id.os);
        TextView stats=findViewById(R.id.stats);
        TextView dbms=findViewById(R.id.dbms);
        TextView psyclgy=findViewById(R.id.psyclgy);
        TextView dda=findViewById(R.id.dda);
        TextView androdvlpmnt=findViewById(R.id.androdvlpmnt);
        TextView vcshrp=findViewById(R.id.vcshrp);
        TextView entrpnr=findViewById(R.id.entrprnr);
        ///---Edu
        TextView acdmicwrtngandrdng=findViewById(R.id.acdmicwrtngandrdng);
        TextView clssrmmgmnt=findViewById(R.id.clssrmmgmnt);
        TextView motois=findViewById(R.id.motois);
        TextView pkstdy=findViewById(R.id.pkstdy);

        TextView chlddvlpmnt=findViewById(R.id.chlddvlpmnt);
        TextView topkstdy=findViewById(R.id.topkstdy);
        TextView tourdu=findViewById(R.id.tourdu);
        TextView cntmrisuoedu=findViewById(R.id.cntmrisuoedu);
        TextView Qntitvrsrch=findViewById(R.id.Qntitvrsrch);
        TextView artcrfnclgrfy=findViewById(R.id.artcrfnclgrfy);

        //---Economics
        TextView Acntig=findViewById(R.id.Acntig);
        TextView ir=findViewById(R.id.ir);
        TextView infrlststc=findViewById(R.id.infrlststc);
        TextView microeconanlsis=findViewById(R.id.microeconanlsis);
        TextView intrmdtmicroecon=findViewById(R.id.intrmdtmicroecon);
        TextView prncplofmacrec=findViewById(R.id.prncplofmacrec);
        TextView introsocio=findViewById(R.id.introsocio);
        TextView bsceconmtrcs=findViewById(R.id.bsceconmtrcs);
        TextView mntrytheornplcy=findViewById(R.id.mntrytheornplcy);
        TextView fnnclinsnmrkts=findViewById(R.id.fnnclinsnmrkts);
        TextView pblcfnnce=findViewById(R.id.pblcfnnce);
        TextView pltclecnmy=findViewById(R.id.pltclecnmy);
        TextView envrmntlecn=findViewById(R.id.envrmntlecn);
//------ba---------------
        TextView prncleofmngmnt=findViewById(R.id.prncleofmngmnt);
        TextView cstacnting=findViewById(R.id.cstacnting);

        TextView bsnscmnction=findViewById(R.id.bsnscmnction);
        TextView mrktigmngmnt=findViewById(R.id.mrktigmngmnt);
        TextView fnncialmngmnt=findViewById(R.id.fnncialmngmnt);

        TextView fnnclstatmntanlyss=findViewById(R.id.fnnclstatmntanlyss);
        TextView crprtfnnce=findViewById(R.id.crprtfnnce);
        TextView hrm=findViewById(R.id.hrm);










//Link Movement
        //----__Cs
        physx.setMovementMethod(LinkMovementMethod.getInstance());
        mthfndmntl.setMovementMethod(LinkMovementMethod.getInstance());
        introcmptr.setMovementMethod(LinkMovementMethod.getInstance());
        bscprgrmng.setMovementMethod(LinkMovementMethod.getInstance());
        islmyt.setMovementMethod(LinkMovementMethod.getInstance());
        dld.setMovementMethod(LinkMovementMethod.getInstance());
        cmnction.setMovementMethod(LinkMovementMethod.getInstance());
        graph_theory.setMovementMethod(LinkMovementMethod.getInstance());
        oop.setMovementMethod(LinkMovementMethod.getInstance());
        dmth.setMovementMethod(LinkMovementMethod.getInstance());
        os.setMovementMethod(LinkMovementMethod.getInstance());
        stats.setMovementMethod(LinkMovementMethod.getInstance());
        dbms.setMovementMethod(LinkMovementMethod.getInstance());
        psyclgy.setMovementMethod(LinkMovementMethod.getInstance());
        entrpnr.setMovementMethod(LinkMovementMethod.getInstance());
        androdvlpmnt.setMovementMethod(LinkMovementMethod.getInstance());
        vcshrp.setMovementMethod(LinkMovementMethod.getInstance());
        dda.setMovementMethod(LinkMovementMethod.getInstance());



        //--------Edu------------
        acdmicwrtngandrdng.setMovementMethod(LinkMovementMethod.getInstance());
        clssrmmgmnt.setMovementMethod(LinkMovementMethod.getInstance());
        motois.setMovementMethod(LinkMovementMethod.getInstance());
        introcmptr.setMovementMethod(LinkMovementMethod.getInstance());
        pkstdy.setMovementMethod(LinkMovementMethod.getInstance());
        chlddvlpmnt.setMovementMethod(LinkMovementMethod.getInstance());
        topkstdy.setMovementMethod(LinkMovementMethod.getInstance());
        tourdu.setMovementMethod(LinkMovementMethod.getInstance());
        cntmrisuoedu.setMovementMethod(LinkMovementMethod.getInstance());
        Qntitvrsrch.setMovementMethod(LinkMovementMethod.getInstance());
        artcrfnclgrfy.setMovementMethod(LinkMovementMethod.getInstance());
        //---Economics

        Acntig.setMovementMethod(LinkMovementMethod.getInstance());
        ir.setMovementMethod(LinkMovementMethod.getInstance());
        infrlststc.setMovementMethod(LinkMovementMethod.getInstance());
        microeconanlsis.setMovementMethod(LinkMovementMethod.getInstance());
        intrmdtmicroecon.setMovementMethod(LinkMovementMethod.getInstance());
        prncplofmacrec.setMovementMethod(LinkMovementMethod.getInstance());
        introsocio.setMovementMethod(LinkMovementMethod.getInstance());
        bsceconmtrcs.setMovementMethod(LinkMovementMethod.getInstance());
        mntrytheornplcy.setMovementMethod(LinkMovementMethod.getInstance());
        fnnclinsnmrkts.setMovementMethod(LinkMovementMethod.getInstance());
        pblcfnnce.setMovementMethod(LinkMovementMethod.getInstance());
        pltclecnmy.setMovementMethod(LinkMovementMethod.getInstance());
        envrmntlecn.setMovementMethod(LinkMovementMethod.getInstance());
        //-----Ba-------------------------------
        prncleofmngmnt.setMovementMethod(LinkMovementMethod.getInstance());
        cstacnting.setMovementMethod(LinkMovementMethod.getInstance());

        bsnscmnction.setMovementMethod(LinkMovementMethod.getInstance());
        mrktigmngmnt.setMovementMethod(LinkMovementMethod.getInstance());
        fnncialmngmnt.setMovementMethod(LinkMovementMethod.getInstance());

        fnnclstatmntanlyss.setMovementMethod(LinkMovementMethod.getInstance());
        crprtfnnce.setMovementMethod(LinkMovementMethod.getInstance());
        hrm.setMovementMethod(LinkMovementMethod.getInstance());




//---------CS-----
        if(mSharedprefs.getBoolean("chbscprgrmng",false)){
            crdbscprgrmng.setVisibility(View.VISIBLE);
        } if(mSharedprefs.getBoolean("chmthfndmntl",false)){
            crdmthfndmntl.setVisibility(View.VISIBLE);
        }  if(mSharedprefs.getBoolean("chphysx",false)){
            crdphysx.setVisibility(View.VISIBLE);
        } if(mSharedprefs.getBoolean("chislmyt",false)){
            crdismyt.setVisibility(View.VISIBLE);
        }if(mSharedprefs.getBoolean("chintrocmptr",false)){
            crdintrocmptr.setVisibility(View.VISIBLE);
        }if(mSharedprefs.getBoolean("chdld",false)){
            crddld.setVisibility(View.VISIBLE);
        }if(mSharedprefs.getBoolean("chicmnction",false)){
            crdcmnction.setVisibility(View.VISIBLE);
        }if(mSharedprefs.getBoolean("chgraph_theory",false)){
            crdgraph_theory.setVisibility(View.VISIBLE);
        }if(mSharedprefs.getBoolean("choop",false)){
            crdoop.setVisibility(View.VISIBLE);
        }if(mSharedprefs.getBoolean("chdmth",false)){
            crddmth.setVisibility(View.VISIBLE);
        }if(mSharedprefs.getBoolean("chpsyclgy",false)){
            crdpsyclgy.setVisibility(View.VISIBLE);
        }if(mSharedprefs.getBoolean("chstats",false)){
            crdstats.setVisibility(View.VISIBLE);
        }if(mSharedprefs.getBoolean("chos",false)){
            crdos.setVisibility(View.VISIBLE);
        }if(mSharedprefs.getBoolean("chdbms",false)){
            crddbms.setVisibility(View.VISIBLE);
        }if(mSharedprefs.getBoolean("chdda",false)){
            crddda.setVisibility(View.VISIBLE);
        }if(mSharedprefs.getBoolean("chandrodvlpmnt",false)){
            crdandrodvlpmnt.setVisibility(View.VISIBLE);
        }if(mSharedprefs.getBoolean("chvcshrp",false)){
            crdvcshrp.setVisibility(View.VISIBLE);
        }if(mSharedprefs.getBoolean("chEntrprnr",false)){
            crdEntrprnr.setVisibility(View.VISIBLE);
        }
//------Edu---

        if(mSharedprefs.getBoolean("chacdmicwrtngandrdng",false)){
            cardacdmicwrtngandrdng.setVisibility(View.VISIBLE);
        }if(mSharedprefs.getBoolean("chclssrmmgmnt",false)){
            cardclssrmmgmnt.setVisibility(View.VISIBLE);
        }if(mSharedprefs.getBoolean("chmotois",false)){
            cardmotois.setVisibility(View.VISIBLE);
        }if(mSharedprefs.getBoolean("chpkstdy",false)){
            cardpkstdy.setVisibility(View.VISIBLE);
        }if(mSharedprefs.getBoolean("chcntmrisuoedu",false)){
            cardcntmrisuoedu.setVisibility(View.VISIBLE);
        }if(mSharedprefs.getBoolean("chtourdu",false)){
            cardtourdu.setVisibility(View.VISIBLE);
        }if(mSharedprefs.getBoolean("chchlddvlpmnt",false)){
            cardchlddvlpmnt.setVisibility(View.VISIBLE);
        }if(mSharedprefs.getBoolean("chartcrfnclgrfy",false)){
            cardartcrfnclgrfy.setVisibility(View.VISIBLE);
        }if(mSharedprefs.getBoolean("chtopkstdy",false)){
            cardtopkstdy.setVisibility(View.VISIBLE);
        }if(mSharedprefs.getBoolean("chQntitvrsrch",false)){
            cardQntitvrsrch.setVisibility(View.VISIBLE);
        }
        //---Economics
        if(mSharedprefs.getBoolean("chAcntig",false)){
            cardAcntig.setVisibility(View.VISIBLE);
        }if(mSharedprefs.getBoolean("chir",false)){
            cardir.setVisibility(View.VISIBLE);
        }if(mSharedprefs.getBoolean("chinfrlststc",false)){
            cardinfrlststc.setVisibility(View.VISIBLE);
        }if(mSharedprefs.getBoolean("chmicroeconanlsis",false)){
            cardmicroeconanlsis.setVisibility(View.VISIBLE);
        }if(mSharedprefs.getBoolean("chintrmdtmicroecon",false)){
            cardintrmdtmicroecon.setVisibility(View.VISIBLE);
        }if(mSharedprefs.getBoolean("chprncplofmacrec",false)){
            cardprncplofmacrec.setVisibility(View.VISIBLE);
        }if(mSharedprefs.getBoolean("chintrosocio",false)){
            cardintrosocio.setVisibility(View.VISIBLE);
        }if(mSharedprefs.getBoolean("chbsceconmtrcs",false)){
            cardbsceconmtrcs.setVisibility(View.VISIBLE);
        }if(mSharedprefs.getBoolean("chmntrytheornplcy",false)){
            cardmntrytheornplcy.setVisibility(View.VISIBLE);
        }if(mSharedprefs.getBoolean("chfnnclinsnmrkts",false)){
            cardfnnclinsnmrkts.setVisibility(View.VISIBLE);
        }if(mSharedprefs.getBoolean("chpltclecnmy",false)){
            cardpltclecnmy.setVisibility(View.VISIBLE);
        }if(mSharedprefs.getBoolean("chpblcfnnce",false)){
            cardpblcfnnce.setVisibility(View.VISIBLE);
        }if(mSharedprefs.getBoolean("chenvrmntlecn",false)){
            cardenvrmntlecn.setVisibility(View.VISIBLE);
        }
        //---------Ba
        if(mSharedprefs.getBoolean("chprncleofmngmnt",false)){
            cardprncleofmngmnt.setVisibility(View.VISIBLE);
        }if(mSharedprefs.getBoolean("chcstacnting",false)){
            cardcstacnting.setVisibility(View.VISIBLE);
        }if(mSharedprefs.getBoolean("chbsnscmnction",false)){
            cardbsnscmnction.setVisibility(View.VISIBLE);
        }if(mSharedprefs.getBoolean("chmrktigmngmnt",false)){
            cardmrktigmngmnt.setVisibility(View.VISIBLE);
        }if(mSharedprefs.getBoolean("chfnncialmngmnt",false)){
            cardfnncialmngmnt.setVisibility(View.VISIBLE);
        }if(mSharedprefs.getBoolean("chfnnclstatmntanlyss",false)){
            cardfnnclstatmntanlyss.setVisibility(View.VISIBLE);
        }if(mSharedprefs.getBoolean("chcrprtfnnce",false)){
            cardcrprtfnnce.setVisibility(View.VISIBLE);
        }if(mSharedprefs.getBoolean("chhrm",false)){
            cardhrm.setVisibility(View.VISIBLE);
        }





    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch(item.getItemId()){
            case R.id.reselectbooks:
                SharedPreferences s=PreferenceManager.getDefaultSharedPreferences(this);
                SharedPreferences.Editor editor=s.edit();
                editor.putBoolean("fstart",true);
                editor.apply();

                Intent intent=new Intent(Selected_Books.this,Books_Selecter.class);

                startActivity(intent);

        }
        return super.onOptionsItemSelected(item);
    }
}