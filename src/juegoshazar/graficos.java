/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package juegoshazar;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
public class graficos extends javax.swing.JFrame implements Runnable{
Thread hilo1;
Thread hilo2;
Thread hilo3;
Thread hilo4;
Thread hilo5;
Thread hilo6;
Thread hilo7;
Thread hilo8;
 LinkedList<Integer> repe = new LinkedList<>();
int c1=0,c2=0,termineitor=0,t=200,td=200,ac=90,conta=0,apuesta=0,credito=0,puntos=0;
int ima[]=new int[20];
int posi[]={-90,0,90,180,-90,0,90,180,-90,0,90,180,-90,0,90,180,-90,0,90,180};

int co[]=new int[20];
public void metodo1(){

    c1=(int) (Math.random()*(6-1+1)+1);
    try {
        Thread.sleep(td);
    } catch (InterruptedException ex) {
        Logger.getLogger(graficos.class.getName()).log(Level.SEVERE, null, ex);
    }
    
    
}
public void metodo2(){
    c2=(int) (Math.random()*(6-1+1)+1);
    try {
        Thread.sleep(td);
    } catch (InterruptedException ex) {
        Logger.getLogger(graficos.class.getName()).log(Level.SEVERE, null, ex);
    }
     
}
public void metodo3(){
    posi[0]+=ac;
   posi[1]+=ac;
    posi[2]+=ac;
    posi[3]+=ac;
   if(posi[0]==270){
       posi[0]=-90;
       ima[0]=(int) (Math.random()*(15-1+1)+1);
        imat41.setIcon(imatra[ima[0]]);
   }else if(posi[1]==270){
       posi[1]=-90;
       ima[1]=(int) (Math.random()*(15-1+1)+1);
        imat42.setIcon(imatra[ima[1]]);
   }else if(posi[2]==270){
       posi[2]=-90;
       ima[2]=(int) (Math.random()*(15-1+1)+1);
        imat43.setIcon(imatra[ima[2]]);
   }else if(posi[3]==270){
       posi[3]=-90;
       ima[3]=(int) (Math.random()*(15-1+1)+1);
        imat44.setIcon(imatra[ima[3]]);
   }
    try {   
        Thread.sleep(t);
    } catch (InterruptedException ex) {
        Logger.getLogger(graficos.class.getName()).log(Level.SEVERE, null, ex);
    }
               
        
        
}
public void metodo4(){
     posi[4]+=ac;
    posi[5]+=ac;
    posi[6]+=ac;
    posi[7]+=ac;
   if(posi[4]==270){
       posi[4]=-90;
       ima[4]=(int) (Math.random()*(15-1+1)+1);
        imat45.setIcon(imatra[ima[4]]);
   }else if(posi[5]==270){
       posi[5]=-90;
       ima[5]=(int) (Math.random()*(15-1+1)+1);
        imat46.setIcon(imatra[ima[5]]);
   }else if(posi[6]==270){
       posi[6]=-90;
       ima[6]=(int) (Math.random()*(15-1+1)+1);
        imat47.setIcon(imatra[ima[6]]);
   }else if(posi[7]==270){
       posi[7]=-90;
       ima[7]=(int) (Math.random()*(15-1+1)+1);
        imat48.setIcon(imatra[ima[7]]);
   }
    try {   
        Thread.sleep(t);
    } catch (InterruptedException ex) {
        Logger.getLogger(graficos.class.getName()).log(Level.SEVERE, null, ex);
    }
               
        
        

}
public void metodo5(){
       posi[8]+=ac;
    posi[9]+=ac;
    posi[10]+=ac;
    posi[11]+=ac;
   if(posi[8]==270){
       posi[8]=-90;
       ima[8]=(int) (Math.random()*(15-1+1)+1);
        imat49.setIcon(imatra[ima[8]]);
   }else if(posi[9]==270){
       posi[9]=-90;
        ima[9]=(int) (Math.random()*(15-1+1)+1);
        imat50.setIcon(imatra[ima[9]]);
   }else if(posi[10]==270){
       posi[10]=-90;
        ima[10]=(int) (Math.random()*(15-1+1)+1);
        imat51.setIcon(imatra[ima[10]]);
   }else if(posi[11]==270){
       posi[11]=-90;
        ima[11]=(int) (Math.random()*(15-1+1)+1);
        imat52.setIcon(imatra[ima[11]]);
   }
    try {   
        Thread.sleep(t);
    } catch (InterruptedException ex) {
        Logger.getLogger(graficos.class.getName()).log(Level.SEVERE, null, ex);
    }
               
        
        

}
public void metodo6(){
      posi[12]+=ac;
    posi[13]+=ac;
    posi[14]+=ac;
    posi[15]+=ac;
   if(posi[12]==270){
       posi[12]=-90;
       ima[12]=(int) (Math.random()*(15-1+1)+1);
        imat53.setIcon(imatra[ima[12]]);
   }else if(posi[13]==270){
       posi[13]=-90;
       ima[13]=(int) (Math.random()*(15-1+1)+1);
        imat54.setIcon(imatra[ima[13]]);
   }else if(posi[14]==270){
       posi[14]=-90;
       ima[14]=(int) (Math.random()*(15-1+1)+1);
        imat55.setIcon(imatra[ima[14]]);
   }else if(posi[15]==270){
       posi[15]=-90;
       ima[15]=(int) (Math.random()*(15-1+1)+1);
        imat56.setIcon(imatra[ima[15]]);
   }
    try {   
        Thread.sleep(t);
    } catch (InterruptedException ex) {
        Logger.getLogger(graficos.class.getName()).log(Level.SEVERE, null, ex);
    }
               
        
        

}
public void metodo7(){
     posi[16]+=ac;
    posi[17]+=ac;
    posi[18]+=ac;
    posi[19]+=ac;
   if(posi[16]==270){
       posi[16]=-90;
       ima[16]=(int) (Math.random()*(15-1+1)+1);
        imat57.setIcon(imatra[ima[16]]);
   }else if(posi[17]==270){
       posi[17]=-90;
       ima[17]=(int) (Math.random()*(15-1+1)+1);
        imat58.setIcon(imatra[ima[17]]);
   }else if(posi[18]==270){
       posi[18]=-90;
       ima[18]=(int) (Math.random()*(15-1+1)+1);
        imat59.setIcon(imatra[ima[18]]);
   }else if(posi[19]==270){
       posi[19]=-90;
       ima[19]=(int) (Math.random()*(15-1+1)+1);
        imat60.setIcon(imatra[ima[19]]);
   }
    try {   
        Thread.sleep(t);
    } catch (InterruptedException ex) {
        Logger.getLogger(graficos.class.getName()).log(Level.SEVERE, null, ex);
    }
               
        
        

}
public void metodo8(){
   termineitor++;
    try {
        Thread.sleep(t);
    } catch (InterruptedException ex) {
        Logger.getLogger(graficos.class.getName()).log(Level.SEVERE, null, ex);
    }
}
ImageIcon imagenes[]=new ImageIcon[7];
ImageIcon imatra[]=new ImageIcon[16];
   
    public graficos() {
        initComponents();
        for(int a =1;a<7;a++){
           imagenes[a]=new ImageIcon(getClass().getResource("/juegoshazar/img"+a+".png"));
       }
        for(int a =1;a<16;a++){
           imatra[a]=new ImageIcon(getClass().getResource("/juegoshazar/it"+a+".png"));
       } 
            imad.setIcon(imagenes[(int) (Math.random()*(6-1+1)+1)]);
            imai.setIcon(imagenes[(int) (Math.random()*(6-1+1)+1)]);       
            imat41.setIcon(imatra[(int) (Math.random()*(15-1+1)+1)]);
            imat42.setIcon(imatra[(int) (Math.random()*(15-1+1)+1)]);
            imat43.setIcon(imatra[(int) (Math.random()*(15-1+1)+1)]);
            imat44.setIcon(imatra[(int) (Math.random()*(15-1+1)+1)]);
            imat45.setIcon(imatra[(int) (Math.random()*(15-1+1)+1)]);
            imat46.setIcon(imatra[(int) (Math.random()*(15-1+1)+1)]);
            imat47.setIcon(imatra[(int) (Math.random()*(15-1+1)+1)]);
            imat48.setIcon(imatra[(int) (Math.random()*(15-1+1)+1)]);            
            imat49.setIcon(imatra[(int) (Math.random()*(15-1+1)+1)]);
            imat50.setIcon(imatra[(int) (Math.random()*(15-1+1)+1)]);
            imat51.setIcon(imatra[(int) (Math.random()*(15-1+1)+1)]);
            imat52.setIcon(imatra[(int) (Math.random()*(15-1+1)+1)]);
            imat53.setIcon(imatra[(int) (Math.random()*(15-1+1)+1)]);
            imat54.setIcon(imatra[(int) (Math.random()*(15-1+1)+1)]);
            imat55.setIcon(imatra[(int) (Math.random()*(15-1+1)+1)]);
            imat56.setIcon(imatra[(int) (Math.random()*(15-1+1)+1)]);
            imat57.setIcon(imatra[(int) (Math.random()*(15-1+1)+1)]);
            imat58.setIcon(imatra[(int) (Math.random()*(15-1+1)+1)]);
            imat59.setIcon(imatra[(int) (Math.random()*(15-1+1)+1)]);
            imat60.setIcon(imatra[(int) (Math.random()*(15-1+1)+1)]);
             imat41.setLocation(0,posi[0]);
               paneltra2.setVisible(false);
               imai.setVisible(false);
               imad.setVisible(false);
               panelp.setVisible(false);
               btjugar.setVisible(false);
             textoingreso.setVisible(false);
             textoapostar.setVisible(false);
             vapuesta.setVisible(false);
             vcredito.setVisible(false);
             
    
  
    }
    public void cuadros(){
        for(int i=0;i<repe.size();i++){
            if(repe.isEmpty()!=false){
            if(repe.get(i)==0){
                imat41.setBorder(BorderFactory.createLineBorder(Color.blue,4));
                  imat41.setLocation(0,posi[0]);
            }else{
                 if(repe.get(i)==1){
                imat42.setBorder(BorderFactory.createLineBorder(Color.blue,4));
                imat42.setLocation(0,posi[1]);
            }else{
                      if(repe.get(i)==2){
                imat43.setBorder(BorderFactory.createLineBorder(Color.blue,4));
                      imat43.setLocation(0,posi[2]);}else{
                          if(repe.get(i)==3){
                imat44.setBorder(BorderFactory.createLineBorder(Color.blue,4));
                          imat44.setLocation(0,posi[3] );}else{
                              if(repe.get(i)==4){
                imat45.setBorder(BorderFactory.createLineBorder(Color.blue,4));
                              imat45.setLocation(110,posi[4]);}else{
                                  if(repe.get(i)==5){
                imat46.setBorder(BorderFactory.createLineBorder(Color.blue,4));
                                  imat46.setLocation(110,posi[5] );}else{
                                      if(repe.get(i)==6){
                imat47.setBorder(BorderFactory.createLineBorder(Color.blue,4));
                                      imat47.setLocation(110,posi[6] );}else{
                                          if(repe.get(i)==7){
                imat48.setBorder(BorderFactory.createLineBorder(Color.blue,4));
                                          imat48.setLocation(110,posi[7] );}else{
                                              if(repe.get(i)==8){
                imat49.setBorder(BorderFactory.createLineBorder(Color.blue,4));
                                              imat49.setLocation(220,posi[8] );}else{
                                                  if(repe.get(i)==9){
                imat50.setBorder(BorderFactory.createLineBorder(Color.blue,4));
                                                  imat50.setLocation(220,posi[9]);}else{
                                                      if(repe.get(i)==10){
                imat51.setBorder(BorderFactory.createLineBorder(Color.blue,4));
                                                      imat51.setLocation(220,posi[10]);}else{
                                                          if(repe.get(i)==11){
                imat52.setBorder(BorderFactory.createLineBorder(Color.blue,4));
                                                          imat52.setLocation(220,posi[11]);}else{
                                                              if(repe.get(i)==12){
                imat53.setBorder(BorderFactory.createLineBorder(Color.blue,4));
                                                              imat53.setLocation(330,posi[12]);}else{
                                                                  if(repe.get(i)==13){
                imat54.setBorder(BorderFactory.createLineBorder(Color.blue,4));
                                                                  imat54.setLocation(330,posi[13]);}else{
                                                                      if(repe.get(i)==14){
                imat55.setBorder(BorderFactory.createLineBorder(Color.blue,4));
                                                                      imat55.setLocation(330,posi[14]);}else{
                                                                          if(repe.get(i)==15){
                imat56.setBorder(BorderFactory.createLineBorder(Color.blue,4));
                                                                          imat56.setLocation(330,posi[15]);}else{
                                                                              if(repe.get(i)==16){
                imat57.setBorder(BorderFactory.createLineBorder(Color.blue,4));
                                                                              imat57.setLocation(440,posi[16]);}else{
                                                                                  if(repe.get(i)==17){
                imat58.setBorder(BorderFactory.createLineBorder(Color.blue,4));
                                                                                  imat58.setLocation(440,posi[17]);}else{
                                                                                      if(repe.get(i)==18){
                imat59.setBorder(BorderFactory.createLineBorder(Color.blue,4));
                                                                                      imat59.setLocation(440,posi[18]);}else{
                                                                                          if(repe.get(i)==19){
                imat60.setBorder(BorderFactory.createLineBorder(Color.blue,4));
                                                                                          imat60.setLocation(440,posi[19]);}
                                                                                      }
                                                                                  }
                                                                              }
                                                                          }
                                                                      }
                                                                  }
                                                              }
                                                          }
                                                      }
                                                  }
                                              }
                                          }
                                      }
                                  }
                              }
                          }
                      }
                 }
            }
        }}
    try {
        Thread.sleep(4000);
    } catch (InterruptedException ex) {
        Logger.getLogger(graficos.class.getName()).log(Level.SEVERE, null, ex);
    }
     
         imat41.setBorder(BorderFactory.createCompoundBorder());
         imat42.setBorder(BorderFactory.createCompoundBorder());
         imat43.setBorder(BorderFactory.createCompoundBorder());
         imat44.setBorder(BorderFactory.createCompoundBorder());
         imat45.setBorder(BorderFactory.createCompoundBorder());
         imat46.setBorder(BorderFactory.createCompoundBorder());
         imat47.setBorder(BorderFactory.createCompoundBorder());
         imat48.setBorder(BorderFactory.createCompoundBorder());
         imat49.setBorder(BorderFactory.createCompoundBorder());
         imat50.setBorder(BorderFactory.createCompoundBorder());
         imat51.setBorder(BorderFactory.createCompoundBorder());
         imat52.setBorder(BorderFactory.createCompoundBorder());
         imat53.setBorder(BorderFactory.createCompoundBorder());
         imat54.setBorder(BorderFactory.createCompoundBorder());
         imat55.setBorder(BorderFactory.createCompoundBorder());
         imat56.setBorder(BorderFactory.createCompoundBorder());
         imat57.setBorder(BorderFactory.createCompoundBorder());
         imat58.setBorder(BorderFactory.createCompoundBorder());
         imat59.setBorder(BorderFactory.createCompoundBorder());
         imat60.setBorder(BorderFactory.createCompoundBorder());
                    imat41.setLocation(0,posi[0]);
                    imat42.setLocation(0,posi[1]);
                    imat43.setLocation(0,posi[2] );
                    imat44.setLocation(0,posi[3]);
                    imat45.setLocation(110,posi[4]);
                    imat46.setLocation(110,posi[5]);
                    imat47.setLocation(110,posi[6]);
                    imat48.setLocation(110,posi[7]);
                    imat49.setLocation(220,posi[8]);
                    imat50.setLocation(220,posi[9]);
                    imat51.setLocation(220,posi[10]);
                    imat52.setLocation(220,posi[11]);
                    imat53.setLocation(330,posi[12]);
                    imat54.setLocation(330,posi[13]);
                    imat55.setLocation(330,posi[14]);
                    imat56.setLocation(330,posi[15]);
                    imat57.setLocation(440,posi[16]);
                    imat58.setLocation(440,posi[17]);
                    imat59.setLocation(440,posi[18]);
                    imat60.setLocation(440,posi[19]);
                    
          
                  
    }
    public void puntos(){
        repe.clear();
        puntos=0;
        if(hilo7.isAlive()==false){
          
                for(int j=0;j<4;j++){
                    conta=0;
                    if(co[j]!=0){
                        for(int i=0;i<4;i++){
                            if(co[j]==co[i+4]){
                                conta=conta+2;
                                for(int k=0;k<4;k++){
                                    if(co[j]==co[k+8]){
                                        conta=conta+1;
                                        repe.add(k+8);
                                        repe.add(j);
                                        repe.add(i+4);
                                        for(int l=0;l<4;l++){
                                            if(co[j]==co[l+12]){
                                                conta=conta+1;
                                                repe.add(l+12);
                                                for(int m=0;m<4;m++){
                                                    if(co[j]==co[m+16]){
                                                        conta=conta+1;
                                                        repe.add(m+16);
                                                        
                                                    }
                                                }
                                            }
                                        }
                                    }}}
                        }
                        if(conta>2){
                            puntos=puntos+(co[j]*conta);
                              if(puntos<0){
            credito=credito+(puntos*apuesta);
        }else {
            credito=credito-apuesta;
        }
                        }
                    }
                }
              
                
    }
        
    }
@Override
public void run(){
    
        Thread temporal = Thread.currentThread();
        while(termineitor<20){
                    if(termineitor<4){
                    if(temporal==hilo1)
                    metodo1();
                    else if(temporal==hilo2)
                    metodo2();
                    else if(temporal==hilo3)
                    metodo3();
                    else if(temporal==hilo4)
                    metodo4();
                    else if(temporal==hilo5)
                    metodo5();
                    else if(temporal==hilo6)
                    metodo6();
                    else if(temporal==hilo7)
                    metodo7();
                    else if(temporal==hilo8)
                    metodo8();
                    }else if(termineitor<8){
                    if(temporal==hilo8)
                    metodo8();
                    else if(temporal==hilo1)
                    metodo1();
                    else if(temporal==hilo2)
                    metodo2();
                    else if(temporal==hilo4)
                    metodo4();
                    else if(temporal==hilo5)
                    metodo5();
                    else if(temporal==hilo6)
                    metodo6();
                    else if(temporal==hilo7)
                    metodo7();
                    }else if(termineitor<12){
                    if(temporal==hilo8)
                    metodo8();
                    else if(temporal==hilo1)
                    metodo1();
                    else if(temporal==hilo2)
                    metodo2();
                    else if(temporal==hilo5)
                    metodo5();
                    else if(temporal==hilo6)
                    metodo6();
                    else if(temporal==hilo7)
                    metodo7();
                    }else if(termineitor<16){
                    if(temporal==hilo8)
                    metodo8();
                    else if(temporal==hilo1)
                    metodo1();
                    else if(temporal==hilo2)
                    metodo2();
                    else if(temporal==hilo6)
                    metodo6();
                    else if(temporal==hilo7)
                    metodo7();
                    }else if(termineitor<=20){
                    if(temporal==hilo8)
                    metodo8();
                    else if(temporal==hilo1)
                    metodo1();
                    else if(temporal==hilo2)
                    metodo2();
                    else if(temporal==hilo7)
                    metodo7();
                    }
                    imad.setIcon(imagenes[c1]);
                    imai.setIcon(imagenes[c2]);
                    imat41.setLocation(0,posi[0]);
                    imat42.setLocation(0,posi[1]);
                    imat43.setLocation(0,posi[2] );
                    imat44.setLocation(0,posi[3]);
                    imat45.setLocation(110,posi[4]);
                    imat46.setLocation(110,posi[5]);
                    imat47.setLocation(110,posi[6]);
                    imat48.setLocation(110,posi[7]);
                    imat49.setLocation(220,posi[8]);
                    imat50.setLocation(220,posi[9]);
                    imat51.setLocation(220,posi[10]);
                    imat52.setLocation(220,posi[11]);
                    imat53.setLocation(330,posi[12]);
                    imat54.setLocation(330,posi[13]);
                    imat55.setLocation(330,posi[14]);
                    imat56.setLocation(330,posi[15]);
                    imat57.setLocation(440,posi[16]);
                    imat58.setLocation(440,posi[17]);
                    imat59.setLocation(440,posi[18]);
                    imat60.setLocation(440,posi[19]);
                   
                      for(int i=0;i<20;i++){
                        if(posi[i]!=-90){
                            co[i]=ima[i];
                        }else
                            co[i]=0; }
                           
            } 
  
 }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btjuego = new javax.swing.JButton();
        imai = new javax.swing.JLabel();
        imad = new javax.swing.JLabel();
        vcredito = new javax.swing.JTextField();
        vapuesta = new javax.swing.JTextField();
        paneltra2 = new javax.swing.JPanel();
        imat41 = new javax.swing.JLabel();
        imat42 = new javax.swing.JLabel();
        imat43 = new javax.swing.JLabel();
        imat44 = new javax.swing.JLabel();
        imat45 = new javax.swing.JLabel();
        imat46 = new javax.swing.JLabel();
        imat47 = new javax.swing.JLabel();
        imat48 = new javax.swing.JLabel();
        imat49 = new javax.swing.JLabel();
        imat50 = new javax.swing.JLabel();
        imat51 = new javax.swing.JLabel();
        imat52 = new javax.swing.JLabel();
        imat53 = new javax.swing.JLabel();
        imat54 = new javax.swing.JLabel();
        imat55 = new javax.swing.JLabel();
        imat56 = new javax.swing.JLabel();
        imat57 = new javax.swing.JLabel();
        imat58 = new javax.swing.JLabel();
        imat59 = new javax.swing.JLabel();
        imat60 = new javax.swing.JLabel();
        btjugar = new javax.swing.JButton();
        rbdadoz = new javax.swing.JRadioButton();
        rbtraga = new javax.swing.JRadioButton();
        panelp = new javax.swing.JPanel();
        prueva3 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        textoingreso = new javax.swing.JLabel();
        textoapostar = new javax.swing.JLabel();
        btsalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btjuego.setText("iniciar");
        btjuego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btjuegoActionPerformed(evt);
            }
        });
        getContentPane().add(btjuego, new org.netbeans.lib.awtextra.AbsoluteConstraints(956, 20, -1, -1));

        imai.setBackground(new java.awt.Color(0, 0, 102));
        getContentPane().add(imai, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 427, 453, 488));

        imad.setBackground(new java.awt.Color(51, 0, 153));
        getContentPane().add(imad, new org.netbeans.lib.awtextra.AbsoluteConstraints(459, 427, 453, 488));

        vcredito.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                vcreditoKeyTyped(evt);
            }
        });
        getContentPane().add(vcredito, new org.netbeans.lib.awtextra.AbsoluteConstraints(818, 112, 166, -1));

        vapuesta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                vapuestaKeyTyped(evt);
            }
        });
        getContentPane().add(vapuesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(818, 178, 166, -1));

        imat41.setBackground(new java.awt.Color(0, 0, 255));
        imat41.setForeground(new java.awt.Color(51, 51, 255));
        imat41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        imat42.setBackground(new java.awt.Color(255, 51, 0));

        imat43.setBackground(new java.awt.Color(255, 255, 51));
        imat43.setPreferredSize(new java.awt.Dimension(4, 4));
        imat43.setVerifyInputWhenFocusTarget(false);
        imat43.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        imat44.setBackground(new java.awt.Color(51, 255, 0));

        imat45.setBackground(new java.awt.Color(255, 255, 51));

        imat46.setBackground(new java.awt.Color(51, 0, 153));

        imat47.setBackground(new java.awt.Color(204, 0, 0));

        imat48.setBackground(new java.awt.Color(51, 255, 0));

        imat49.setBackground(new java.awt.Color(255, 255, 51));

        imat50.setBackground(new java.awt.Color(51, 0, 153));

        imat51.setBackground(new java.awt.Color(204, 0, 0));

        imat52.setBackground(new java.awt.Color(51, 255, 0));

        imat53.setBackground(new java.awt.Color(255, 255, 51));

        imat54.setBackground(new java.awt.Color(51, 0, 153));

        imat55.setBackground(new java.awt.Color(204, 0, 0));

        imat56.setBackground(new java.awt.Color(51, 255, 0));

        imat57.setBackground(new java.awt.Color(255, 255, 51));

        imat58.setBackground(new java.awt.Color(51, 0, 153));

        imat59.setBackground(new java.awt.Color(204, 0, 0));

        imat60.setBackground(new java.awt.Color(51, 255, 0));

        javax.swing.GroupLayout paneltra2Layout = new javax.swing.GroupLayout(paneltra2);
        paneltra2.setLayout(paneltra2Layout);
        paneltra2Layout.setHorizontalGroup(
            paneltra2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneltra2Layout.createSequentialGroup()
                .addGroup(paneltra2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(imat41, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(imat43, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                    .addComponent(imat42, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(imat44, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(paneltra2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(imat45, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                    .addComponent(imat46, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(imat47, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(imat48, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(paneltra2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(imat49, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                    .addComponent(imat50, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(imat52, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(imat51, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(paneltra2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paneltra2Layout.createSequentialGroup()
                        .addGroup(paneltra2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(imat53, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(imat54, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(paneltra2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(imat57, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(imat58, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(paneltra2Layout.createSequentialGroup()
                        .addGroup(paneltra2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(imat55, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(imat56, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(paneltra2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(imat60, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(imat59, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        paneltra2Layout.setVerticalGroup(
            paneltra2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneltra2Layout.createSequentialGroup()
                .addGroup(paneltra2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paneltra2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(imat53, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(imat49, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(imat45, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(imat43, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(imat57, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(paneltra2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(paneltra2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(imat54, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(imat58, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(imat50, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                    .addComponent(imat46, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(imat41, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(paneltra2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paneltra2Layout.createSequentialGroup()
                        .addComponent(imat55, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(imat52, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(paneltra2Layout.createSequentialGroup()
                        .addGroup(paneltra2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(imat47, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(imat51, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(imat48, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(paneltra2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(paneltra2Layout.createSequentialGroup()
                            .addComponent(imat59, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(paneltra2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(imat60, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(imat56, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(paneltra2Layout.createSequentialGroup()
                            .addComponent(imat42, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(imat44, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        imat54.getAccessibleContext().setAccessibleDescription("");

        getContentPane().add(paneltra2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 269));

        btjugar.setText("jugar");
        btjugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btjugarActionPerformed(evt);
            }
        });
        getContentPane().add(btjugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 20, -1, -1));

        rbdadoz.setText("dadoz");
        getContentPane().add(rbdadoz, new org.netbeans.lib.awtextra.AbsoluteConstraints(782, 21, -1, -1));

        rbtraga.setText("tragamonedas");
        rbtraga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtragaActionPerformed(evt);
            }
        });
        getContentPane().add(rbtraga, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 21, -1, -1));

        panelp.setBackground(new java.awt.Color(0, 255, 51));
        panelp.setBorder(new javax.swing.border.MatteBorder(null));
        panelp.setMaximumSize(new java.awt.Dimension(550, 210));
        panelp.setRequestFocusEnabled(false);
        panelp.setVerifyInputWhenFocusTarget(false);

        prueva3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prueva3ActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(0, 0, 153));
        jLabel1.setFont(new java.awt.Font("SWComp", 1, 24)); // NOI18N
        jLabel1.setText("credito");

        javax.swing.GroupLayout panelpLayout = new javax.swing.GroupLayout(panelp);
        panelp.setLayout(panelpLayout);
        panelpLayout.setHorizontalGroup(
            panelpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelpLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(prueva3, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        panelpLayout.setVerticalGroup(
            panelpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelpLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(prueva3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        getContentPane().add(panelp, new org.netbeans.lib.awtextra.AbsoluteConstraints(556, 142, -1, -1));

        textoingreso.setFont(new java.awt.Font("Segoe UI Black", 2, 18)); // NOI18N
        textoingreso.setForeground(new java.awt.Color(255, 51, 51));
        textoingreso.setText("ingrese credito");
        getContentPane().add(textoingreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(818, 81, -1, -1));

        textoapostar.setFont(new java.awt.Font("Segoe UI Semibold", 2, 18)); // NOI18N
        textoapostar.setForeground(new java.awt.Color(255, 51, 0));
        textoapostar.setText("ingrese valor a apostar");
        getContentPane().add(textoapostar, new org.netbeans.lib.awtextra.AbsoluteConstraints(818, 147, -1, -1));

        btsalir.setText("salir");
        btsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsalirActionPerformed(evt);
            }
        });
        getContentPane().add(btsalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(956, 55, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btjuegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btjuegoActionPerformed
 
        
      
       panelp.setBounds(0, 271, 550,110);
        if(rbdadoz.isSelected() && rbtraga.isSelected()==false){
          imai.setVisible(true);
          imad.setVisible(true);
           paneltra2.setVisible(false);
               panelp.setVisible(false);
               btjugar.setVisible(false);
             textoingreso.setVisible(false);
             textoapostar.setVisible(false);
             vapuesta.setVisible(false);
             vcredito.setVisible(false);
            btjugar.setVisible(rootPaneCheckingEnabled);
        }else{
            if(rbdadoz.isSelected()==false && rbtraga.isSelected()){
                credito=Integer.parseInt(vcredito.getText());
                 apuesta=Integer.parseInt(vapuesta.getText());
                paneltra2.setVisible(true);
                panelp.setVisible(true);
                 imai.setVisible(false);
          imad.setVisible(false);
                  btjugar.setVisible(rootPaneCheckingEnabled);
            }else {
                if(rbdadoz.isSelected() && rbtraga.isSelected()){
                   credito=Integer.parseInt(vcredito.getText());
                 apuesta=Integer.parseInt(vapuesta.getText());
                   imai.setVisible(true);
          imad.setVisible(true); 
          paneltra2.setVisible(true);
          panelp.setVisible(true);
             btjugar.setVisible(rootPaneCheckingEnabled);
                panelp.setVisible(true);
                }else{
                     JOptionPane.showMessageDialog(this, "favor marcar una opcion");
                     
                }
            }
        }
               
     
       
      
     
   
     
    }//GEN-LAST:event_btjuegoActionPerformed

    private void btjugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btjugarActionPerformed
termineitor=0;
rbdadoz.setVisible(false);
rbtraga.setVisible(false);
btjuego.setVisible(false);

          
        if(rbdadoz.isSelected() && rbtraga.isSelected()==false){
        hilo1= new Thread(this);
        hilo2= new Thread(this);
        hilo8= new Thread(this);
       hilo1.start();
       hilo2.start();
       hilo8.start();
        }else{
            if(rbdadoz.isSelected()==false && rbtraga.isSelected()){
                if(vcredito.getText().isEmpty() || vapuesta.getText().isEmpty()){
                    JOptionPane.showMessageDialog(this, "favor no dejar espacios vacios");
                }else{
                
                    hilo3= new Thread(this);
        hilo4= new Thread(this);
        hilo5= new Thread(this);
        hilo6= new Thread(this);
        hilo7= new Thread(this);
        hilo8= new Thread(this);
       hilo3.start();
       hilo4.start();
       hilo5.start();
       hilo6.start();
       hilo7.start();
       hilo8.start();
          
        credito=credito-apuesta;
          prueva3.setText(""+credito);
          
        
                }
       
            }else {
                if(rbdadoz.isSelected() && rbtraga.isSelected()){
                     if(vcredito.getText().isEmpty() || vapuesta.getText().isEmpty()){
                    JOptionPane.showMessageDialog(this, "favor no dejar espacios vacios");
                }else{
              
        hilo1= new Thread(this);
        hilo2= new Thread(this);
        hilo3= new Thread(this);
        hilo4= new Thread(this);
        hilo5= new Thread(this);
        hilo6= new Thread(this);
        hilo7= new Thread(this);
        hilo8= new Thread(this);
       hilo1.start();
       hilo2.start();
       hilo3.start();
       hilo4.start();
       hilo5.start();
       hilo6.start();
       hilo7.start();
       hilo8.start();
       
        
          prueva3.setText(""+credito);
          
                     }
                }
            }
        }      
    }//GEN-LAST:event_btjugarActionPerformed

    private void prueva3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prueva3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prueva3ActionPerformed

    private void vcreditoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_vcreditoKeyTyped
    char c=evt.getKeyChar();
   if(c<'0' || c>'9')evt.consume();
       
    }//GEN-LAST:event_vcreditoKeyTyped

    private void btsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsalirActionPerformed
      System.exit(WIDTH);
    }//GEN-LAST:event_btsalirActionPerformed

    private void vapuestaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_vapuestaKeyTyped
           char c=evt.getKeyChar();
   if(c<'0' || c>'9')evt.consume();
       
    }//GEN-LAST:event_vapuestaKeyTyped

    private void rbtragaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtragaActionPerformed
        textoingreso.setVisible(true);
             textoapostar.setVisible(true);
             vapuesta.setVisible(true);
             vcredito.setVisible(true);
    }//GEN-LAST:event_rbtragaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(graficos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(graficos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(graficos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(graficos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new graficos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btjuego;
    private javax.swing.JButton btjugar;
    private javax.swing.JButton btsalir;
    private javax.swing.JLabel imad;
    private javax.swing.JLabel imai;
    private javax.swing.JLabel imat41;
    private javax.swing.JLabel imat42;
    private javax.swing.JLabel imat43;
    private javax.swing.JLabel imat44;
    private javax.swing.JLabel imat45;
    private javax.swing.JLabel imat46;
    private javax.swing.JLabel imat47;
    private javax.swing.JLabel imat48;
    private javax.swing.JLabel imat49;
    private javax.swing.JLabel imat50;
    private javax.swing.JLabel imat51;
    private javax.swing.JLabel imat52;
    private javax.swing.JLabel imat53;
    private javax.swing.JLabel imat54;
    private javax.swing.JLabel imat55;
    private javax.swing.JLabel imat56;
    private javax.swing.JLabel imat57;
    private javax.swing.JLabel imat58;
    private javax.swing.JLabel imat59;
    private javax.swing.JLabel imat60;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel panelp;
    private javax.swing.JPanel paneltra2;
    private javax.swing.JTextField prueva3;
    private javax.swing.JRadioButton rbdadoz;
    private javax.swing.JRadioButton rbtraga;
    private javax.swing.JLabel textoapostar;
    private javax.swing.JLabel textoingreso;
    private javax.swing.JTextField vapuesta;
    private javax.swing.JTextField vcredito;
    // End of variables declaration//GEN-END:variables

   
}
