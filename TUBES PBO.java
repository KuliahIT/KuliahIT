package Tubes_PBO;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;



public class JadwalUjian extends Application {
    public static void main(String[] args) { launch(args); }

    private final Label LblJumPer = new Label("Jumlah Peserta :  ");
    private final Label LblWaktu = new Label("Waktu Pelaksaan Ujian :  ");

     private final TextField TxtJumper = new TextField();
     private final TextField TxtWaktu TextField();


    GridPane gp = new GridPane();
     void gui (){
         TxtJumper.setMinWidth(100);
         TxtWaktu.setMinWidth(100);

         gp.setVgap(10);
         gp.add(LblJumper,0,1); gp.add(TxtJumper, 1, 1);
         gp.add(LblWaktu,0,2); gp.add(TxtWaktu,1,2);
         gp.add(BtnJadwalUjian,1,3);
     }

    Button BtnJadwalUjian = new Button("JadwalUjian");
    void JadwalUjian (){
        Isi i = new Isi();
    }


    @Override
    public void start(Stage primaryStage) {
        gui();
        Scene sc = new Scene(gp,340,300);
        gp.setPadding(new Insets(10));
        primaryStage.setScene(sc);
        primaryStage.show();
        BtnJadwalUjian.setOnAction(e->JadwalUjian());
    }
}


 class Isi extends Application {
  


    private final Label LblBIO = new Label("\n=== DATA UJIAN===");
    private final Label LblTangg  = new Label("TANGGAL UJIAN :");
    private final Label LblKet = new Label("KETENTUAN UJIAN :");

    private final TextField TxtTangg = new TextField();
    private final TextField TxtKet = new TextField();


    private final Label LblBIOO = new Label("== PASCA UJIAN==");
    private final Label LblTbt = new Label("TANGGAL, BULAN, TAHUN" (3/Juli/2021) :");
    private final Label LblKt = new Label("PESERTA (<50) :");
    
    private final TextField TxtTbt = new TextField();
    private final TextField TxtKt = new TextField();

    GridPane gp = new GridPane();
    void Gui(){
        TxtBIO.setMinWidth(100);
        TxtTangg.setMinWidth(100);
        TxtKet.setMinWidth(100);
        TxtBIOO.setMinWidth(100);
        TxtTbt.setMinWidth(100);
        TxtKt.setMinWidth(100);

        gp.setVgap(10);
        gp.add(LblBIO, 1,0);
        gp.add(LblTangg,0,1); gp.add(TxtTangg,1,1);
        gp.add(LblKet,0,2); gp.add(TxtKet,1,2);
        gp.add(LblBIOO,1,5);
        gp.add(LblTbt,0,6); gp.add(TxtTbt,1,6);
        gp.add(LblKt,0,7); gp.add(TxtKt,1,7);
        gp.add(Btncek,0,9,2,1);
        

    }

    Button Btncek = new Button("mengecek");
    void mengecek(){

    }
   

    @Override
    public void start(Stage primaryStage) {
    Gui();
        Scene sc = new Scene(gp,340,400);
        gp.setPadding(new Insets(10));
        primaryStage.setScene(sc);
        primaryStage.setTitle("Data Ujian");
        primaryStage.show();
        Btncek.setOnAction(e->mengecek());
    }
}


