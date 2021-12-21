
package o.x;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;
import javafx.scene.paint.Color;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;




public class play extends javax.swing.JFrame {

int  connection = 0;
boolean connected = false ;
boolean change = true;

String ip;
    
 String ox[]={"O","X",""};
 int i =1;
javax.swing.JLabel labs[] = new javax.swing.JLabel[9];
 
    public play() {
       initComponents();
        panel.hide();
        
        
       labs[0]=this.a1;
       labs[1]=this.a2;
       labs[2]=this.a3;
       labs[3]=this.a4;
       labs[4]=this.a5;
       labs[5]=this.a6;
       labs[6]=this.a7;
       labs[7]=this.a8;
       labs[8]=this.a9;
       
       for(int i=0;i<9;i++)
       { 
        labs[i].setHorizontalAlignment(SwingConstants.CENTER);
       }
       lo.setHorizontalAlignment(SwingConstants.CENTER); 
        lx.setHorizontalAlignment(SwingConstants.CENTER);
        status.setHorizontalAlignment(SwingConstants.CENTER);
        my t = new my();
 t.start();
    gen();  
    }
    
    
    
    void  update( )
{ 
    if(!connected)
    {
    if(i==0 )
    { i=1;}
    else if(i==1 ) 
        i=0;
    }
    else if (connected)
    {i=1; }
          
}
    
    
    
    int pas;
   public void gen()
     {
         Random ran=new Random();
                
                int top=6;
                
                for(int i=0;i<=top;i++)
                {
                    pas =(ran.nextInt(25)+97);
                    
                }
     }  
    
    
    
void combination()
{
    
    
    
    
    boolean victory=false; 
    String x="";
    for(int i=0;i<9;i+=3)
     {
         if(!labs[i].getText().equals("") & !labs[i+1].getText().equals("") & !labs[i+2].getText().equals(""))
         {
         if(labs[i].getText().equals(labs[i+1].getText()) & labs[i].getText().equals(labs[i+2].getText()))
        {
            victory=true;
            x=labs[i].getText();
            labs[i].setBackground(java.awt.Color.ORANGE);
            labs[i+1].setBackground(java.awt.Color.ORANGE);
            labs[i+2].setBackground(java.awt.Color.ORANGE);
        }
     } }
    for(int i=0;i<3;i++)
     {
         if(!labs[i].getText().equals("") & !labs[i+3].getText().equals("") & !labs[i+6].getText().equals(""))
         {
         if(labs[i].getText().equals(labs[i+3].getText()) & labs[i].getText().equals(labs[i+6].getText()))
        {
            victory=true;
            x=labs[i].getText();
               labs[i].setBackground(java.awt.Color.ORANGE);
            labs[i+3].setBackground(java.awt.Color.ORANGE);
            labs[i+6].setBackground(java.awt.Color.ORANGE);
         
        }
         
     } }
    
    int z=0;
    if(!labs[z].getText().equals("") & !labs[z+4].getText().equals("") & !labs[z+8].getText().equals(""))
         {
         if(labs[z].getText().equals(labs[z+4].getText()) & labs[z].getText().equals(labs[z+8].getText()))
        {
            victory=true;
             x=labs[z].getText();
                 labs[z].setBackground(java.awt.Color.ORANGE);
            labs[z+4].setBackground(java.awt.Color.ORANGE);
            labs[z+8].setBackground(java.awt.Color.ORANGE);
        
        }
         
     }
    z=2;
    if(!labs[z].getText().equals("") & !labs[z+2].getText().equals("") & !labs[z+4].getText().equals(""))
         {
         if(labs[z].getText().equals(labs[z+2].getText()) & labs[z].getText().equals(labs[z+4].getText()))
        {
            victory=true;
             x=labs[z].getText();
                 labs[z].setBackground(java.awt.Color.ORANGE);
            labs[z+2].setBackground(java.awt.Color.ORANGE);
            labs[z+4].setBackground(java.awt.Color.ORANGE);
        
        }
         
     }
    
int f=0;
 for(int i=0;i<9;i++)
{

if( labs[i].getText().equals("X") || labs[i].getText().equals("O") )
{ 
f++;
}
if(f==9)
{status.setText("MATCH IS A DRAW.....");
    
}
}

    
if(victory)
{ 
    if(x.equals("X"))
status.setText("PLAYER 1 WINS !!");
    else if(x.equals("O"))
status.setText("PLAYER 2 WINS !!");
    i=2;
    change = false;
}


}
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        a2 = new javax.swing.JLabel();
        a5 = new javax.swing.JLabel();
        lo = new javax.swing.JLabel();
        a3 = new javax.swing.JLabel();
        a7 = new javax.swing.JLabel();
        a4 = new javax.swing.JLabel();
        a8 = new javax.swing.JLabel();
        a9 = new javax.swing.JLabel();
        a6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        a1 = new javax.swing.JLabel();
        lx = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        status = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        panel = new javax.swing.JPanel();
        so = new javax.swing.JLabel();
        po = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 255));
        setMaximumSize(new java.awt.Dimension(655, 446));
        setMinimumSize(new java.awt.Dimension(655, 446));
        setPreferredSize(new java.awt.Dimension(655, 446));
        setResizable(false);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                formMouseEntered(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        a2.setBackground(new java.awt.Color(255, 255, 153));
        a2.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        a2.setOpaque(true);
        a2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                a2MouseClicked(evt);
            }
        });
        getContentPane().add(a2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 70, 70));

        a5.setBackground(new java.awt.Color(255, 255, 153));
        a5.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        a5.setOpaque(true);
        a5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                a5MouseClicked(evt);
            }
        });
        getContentPane().add(a5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, 70, 70));

        lo.setBackground(new java.awt.Color(255, 255, 153));
        lo.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        lo.setText("O");
        lo.setOpaque(true);
        lo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loMouseClicked(evt);
            }
        });
        getContentPane().add(lo, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 230, 40, 40));

        a3.setBackground(new java.awt.Color(255, 255, 153));
        a3.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        a3.setOpaque(true);
        a3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                a3MouseClicked(evt);
            }
        });
        getContentPane().add(a3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, 70, 70));

        a7.setBackground(new java.awt.Color(255, 255, 153));
        a7.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        a7.setOpaque(true);
        a7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                a7MouseClicked(evt);
            }
        });
        getContentPane().add(a7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 70, 70));

        a4.setBackground(new java.awt.Color(255, 255, 153));
        a4.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        a4.setOpaque(true);
        a4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                a4MouseClicked(evt);
            }
        });
        getContentPane().add(a4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 70, 70));

        a8.setBackground(new java.awt.Color(255, 255, 153));
        a8.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        a8.setOpaque(true);
        a8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                a8MouseClicked(evt);
            }
        });
        getContentPane().add(a8, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, 70, 70));

        a9.setBackground(new java.awt.Color(255, 255, 153));
        a9.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        a9.setOpaque(true);
        a9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                a9MouseClicked(evt);
            }
        });
        getContentPane().add(a9, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 270, 70, 70));

        a6.setBackground(new java.awt.Color(255, 255, 153));
        a6.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        a6.setOpaque(true);
        a6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                a6MouseClicked(evt);
            }
        });
        getContentPane().add(a6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 180, 70, 70));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("PLAYER 2 :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 230, 120, 40));

        a1.setBackground(new java.awt.Color(255, 255, 153));
        a1.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        a1.setOpaque(true);
        a1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                a1MouseClicked(evt);
            }
        });
        getContentPane().add(a1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 70, 70));

        lx.setBackground(new java.awt.Color(255, 255, 153));
        lx.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        lx.setText("X");
        lx.setOpaque(true);
        lx.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lxMouseClicked(evt);
            }
        });
        getContentPane().add(lx, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 160, 40, 40));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("PLAYER 1 :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 160, 120, 40));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText("PLAYER 1 :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 160, 120, 40));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 0));
        jLabel1.setText("TIK-TAK-TOE");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 170, -1));

        status.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        status.setForeground(new java.awt.Color(204, 0, 0));
        status.setText("PLAYER 1's TURN");
        getContentPane().add(status, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 360, 250, 40));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 0, 0));
        jButton1.setText("REPLAY");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel2.setBackground(new java.awt.Color(255, 0, 0));
        jLabel2.setOpaque(true);
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
        });
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 10, 320));

        panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelMouseExited(evt);
            }
        });
        panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        so.setBackground(new java.awt.Color(0, 0, 0));
        so.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        so.setForeground(new java.awt.Color(255, 255, 0));
        so.setText("SOLO");
        so.setOpaque(true);
        so.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                soMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                soMouseEntered(evt);
            }
        });
        panel.add(so, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 90, 40));

        po.setBackground(new java.awt.Color(0, 0, 0));
        po.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        po.setForeground(new java.awt.Color(255, 255, 0));
        po.setText("PLAY ONLINE");
        po.setOpaque(true);
        po.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                poMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                poMouseEntered(evt);
            }
        });
        panel.add(po, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 90, 40));

        getContentPane().add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 90, 250));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loMouseClicked
        // TODO add your handling code here:
    
    }//GEN-LAST:event_loMouseClicked

    private void a3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a3MouseClicked
    if(a3.getText().equals("") & change )
    { a3.setText(ox[i]); 
    status.setText("PLAYER "+(i+1)+"'s TURN.");
    update();
    }
    
    if(change & connected)
    {send("2",ip);
    change = false;
    status.setText("PLAYER "+(i+1)+"'s TURN.");
    }
    
      combination();
  
    }//GEN-LAST:event_a3MouseClicked

    private void a2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a2MouseClicked
      if(a2.getText().equals("") & change )
    { a2.setText(ox[i]); 
    status.setText("PLAYER "+(i+1)+"'s TURN.");
     update();
    }
   
    if(change & connected)
    {send("1",ip);
    change = false;
     status.setText("PLAYER "+(i+1)+"'s TURN.");
    }
   
    combination();
    
    }//GEN-LAST:event_a2MouseClicked

    private void a6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a6MouseClicked
         if(a6.getText().equals("") & change )
    { a6.setText(ox[i]); 
     status.setText("PLAYER "+(i+1)+"'s TURN.");
    update();
    }
    
    if(change & connected)
    {send("5",ip);
    change = false;
     status.setText("PLAYER "+(i+1)+"'s TURN.");
    }
   
    combination();
    
    }//GEN-LAST:event_a6MouseClicked

    private void a9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a9MouseClicked
        if(a9.getText().equals("") & change )
    { a9.setText(ox[i]); 
   
    status.setText("PLAYER "+(i+1)+"'s TURN.");
     update();
    }
    
    if(change & connected)
    {send("8",ip);
    change = false;
     status.setText("PLAYER "+(i+1)+"'s TURN.");
    }
    
    combination();
    
    }//GEN-LAST:event_a9MouseClicked

    private void a8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a8MouseClicked
        // TODO add your handling code here:
        if(a8.getText().equals("") & change )
    { a8.setText(ox[i]);
    combination();
     status.setText("PLAYER "+(i+1)+"'s TURN.");
    update();
    }
    
    if(change & connected)
    {send("7",ip);
    change = false;
     status.setText("PLAYER "+(i+1)+"'s TURN.");
    }
    status.setText("PLAYER "+(i+1)+"'s TURN.");
    combination();
    
    }//GEN-LAST:event_a8MouseClicked

    private void a4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a4MouseClicked
        if(a4.getText().equals("") & change )
    { a4.setText(ox[i]); 
     status.setText("PLAYER "+(i+1)+"'s TURN.");
     update();
    }
   
    if(change & connected)
    {send("3",ip);
    change = false;
    status.setText("PLAYER "+(i+1)+"'s TURN.");
    }
    
    combination();
    
    }//GEN-LAST:event_a4MouseClicked

    private void a7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a7MouseClicked
        // TODO add your handling code here:
       if(a7.getText().equals("") & change )
    { a7.setText(ox[i]);
    status.setText("PLAYER "+(i+1)+"'s TURN.");
    update();
    }
    
    if(change & connected)
    {send("6",ip);
    change = false;
    status.setText("PLAYER "+(i+1)+"'s TURN.");
    }
    
    combination();
    
    }//GEN-LAST:event_a7MouseClicked

    private void a5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a5MouseClicked
        // TODO add your handling code here:
      if(a5.getText().equals("") & change )
    { a5.setText(ox[i]);
     status.setText("PLAYER "+(i+1)+"'s TURN.");
    update();
    }
    
    if(change & connected)
    {send("4",ip);
    change = false;
     status.setText("PLAYER "+(i+1)+"'s TURN.");
    }
   
    combination();
    
    }//GEN-LAST:event_a5MouseClicked

    private void a1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a1MouseClicked
        // TODO add your handling code here:
         if(a1.getText().equals("") & change )
    { a1.setText(ox[i]);
    status.setText("PLAYER "+(i+1)+"'s TURN.");
    update();
    }
    
    if(change & connected)
    {send("0",ip);
    change = false;
    status.setText("PLAYER "+(i+1)+"'s TURN.");
    }
    
    
  combination();  
    }//GEN-LAST:event_a1MouseClicked

    private void lxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lxMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lxMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        for(i=0;i<9;i++)
{ 
labs[i].setText("");
labs[i].setBackground(new java.awt.Color(255, 255, 153));
}
        status.setText("PLAYER 1's TURN.");
this.i=1;
change=true;

    }//GEN-LAST:event_jButton1ActionPerformed

    private void poMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_poMouseClicked
  turn();        // TODO add your handling code here:
    }//GEN-LAST:event_poMouseClicked

    private void soMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_soMouseClicked
int  connection = 0;
boolean connected = false ;
boolean change = true;
        // TODO add your handling code here:
    }//GEN-LAST:event_soMouseClicked

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
panel.show();        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2MouseEntered

    private void panelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMouseExited
panel.hide();      // TODO add your handling code here:
    }//GEN-LAST:event_panelMouseExited

    private void panelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMouseEntered
      panel.show();
        // TODO add your handling code here:
    }//GEN-LAST:event_panelMouseEntered

    private void poMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_poMouseEntered
panel.show();
        // TODO add your handling code here:
    }//GEN-LAST:event_poMouseEntered

    private void soMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_soMouseEntered
panel.show();        // TODO add your handling code here:
    }//GEN-LAST:event_soMouseEntered

    private void formMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseEntered
panel.hide();        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseEntered

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
play1 obj = new play1();
obj.show();        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2MouseClicked

    
    
    class my extends Thread
    {
        Thread t;
       
        
        public void run()
        { 
            System.out.print("Thread started");
          while(true)
              
          { System.out.println("*******"+receive());}
        }
    }
    
    
    
    
    
    public void send(String str,String ip)
{ 

try{


    {
        
        {
Socket s=new Socket(ip,1555);  
      
DataOutputStream dout=new DataOutputStream(s.getOutputStream());  
  
dout.writeUTF(str);  
dout.flush();  
  
dout.close();  
s.close();
connected=true;

    }
    }
}



catch(Exception e)
{ JOptionPane.showMessageDialog(this,e);}

}

 public String receive()
{ 
try
{ String msg=null;

      ServerSocket ss= new ServerSocket(2222);
   Socket s= ss.accept();
   
DataInputStream dis = new DataInputStream(s.getInputStream());
  msg=(String)dis.readUTF(); 
  
  if(msg.equals("replay"))
  { }
      
if(Integer.parseInt(msg)<pas & connection<1)
{ JOptionPane.showMessageDialog(this,"Connected to Player 2 ." +"\n It's your turn "+"\n Connection id : "+msg+"-"+pas);
connection = 2;
change = true;
status.setText("PLAYER 1's TURN.");
}
else if( Integer.parseInt(msg)>pas & connection<1)
{ JOptionPane.showMessageDialog(this,"Connected to Player 2 ." +"\n It's Player 2's turn "+"\n Connection id : "+msg+"-"+pas);
connection=2;
change=false;
status.setText("PLAYER 2's TURN.");
}
else if( Integer.parseInt(msg)==pas & connection<1)
{ JOptionPane.showMessageDialog(this,"Player 2 tried to connected but connection id is same ." +"\n Try reconnect rby restarting appliction "+"\n Connection id : "+msg+"-"+pas);
connection=2;
}
  if(connected & Integer.parseInt(msg)<9)
  { 
  labs[Integer.parseInt(msg)].setText("O");
  status.setText("PLAYER 1's TURN.");
  combination();
  change=true;
  }
  
  System.out.println(msg+"-------------");
  s.close();
ss.close();  
return msg;
  
}
catch(Exception e)
{ System.out.print(e);}
return null;
}  

public void turn()
{ 
send(pas+"",ip=JOptionPane.showInputDialog("Enter IP address : "));

   

}

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
            java.util.logging.Logger.getLogger(play.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(play.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(play.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(play.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new play().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel a1;
    private javax.swing.JLabel a2;
    private javax.swing.JLabel a3;
    private javax.swing.JLabel a4;
    private javax.swing.JLabel a5;
    private javax.swing.JLabel a6;
    private javax.swing.JLabel a7;
    private javax.swing.JLabel a8;
    private javax.swing.JLabel a9;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lo;
    private javax.swing.JLabel lx;
    private javax.swing.JPanel panel;
    private javax.swing.JLabel po;
    private javax.swing.JLabel so;
    private javax.swing.JLabel status;
    // End of variables declaration//GEN-END:variables
}
