/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

//import static Main.Main.demo;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
//import javax.swing.JOptionPane;
import menu.MenuPanel;

/**
 *
 * @author aome1
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main()
    {
        initComponents();
        //
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/menu/mainMenu3.png")));
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
         MenuDisplay();
         //this.jPanelBody.add(rootPane);
        //xecute excute = new Execute();
       // this.jPanelBody.add( new demo());
        //excute.execude();
    }

    // execude method
    private void MenuDisplay()
    {
        ImageIcon iconMunu = new ImageIcon(getClass().getResource("/menu/iconsMenu.png"));
        ImageIcon iconTraffic = new ImageIcon(getClass().getResource("/menu/traffic.png"));
        ImageIcon iconExit = new ImageIcon(getClass().getResource("/menu/Exit.png"));
        ImageIcon iconPause = new ImageIcon(getClass().getResource("/menu/pause2.png"));
        ImageIcon iconSpeed = new ImageIcon(getClass().getResource("/menu/speed.png"));
        ImageIcon iconSubMenu = new ImageIcon(getClass().getResource("/menu/subMenu2.png"));
        ImageIcon iconSubAcMenu = new ImageIcon(getClass().getResource("/menu/crashed2.png"));
        ImageIcon iconAccident = new ImageIcon(getClass().getResource("/menu/accident.png"));
        ImageIcon iconSpeedUp = new ImageIcon(getClass().getResource("/menu/levelUp1.png"));
        ImageIcon iconSpeedUp2 = new ImageIcon(getClass().getResource("/menu/speedUp2.png"));

        // action Listener
        MenuPanel morning = new MenuPanel(iconSubMenu, "Morning", (ActionEvent e) -> {
            //
        });
        MenuPanel evening = new MenuPanel(iconSubMenu, "Evening", (ActionEvent e) -> {
            // code
        });
        MenuPanel Night = new MenuPanel(iconSubMenu, "Night", (ActionEvent e) ->{
            // code
            
        });
        MenuPanel minor = new MenuPanel(iconSubAcMenu, "Minor",(ActionEvent e) -> 
        {
            
        });
        MenuPanel medium = new MenuPanel(iconSubAcMenu, "Medium",(ActionEvent e) ->
        {
            
        });
        MenuPanel major = new MenuPanel(iconSubAcMenu, "Major",(ActionEvent e) -> 
        {
            
        });
        MenuPanel pauseIcon = new MenuPanel(iconPause, "Pause", (ActionEvent e) ->
        {
            
        }); 
        MenuPanel speedUp = new MenuPanel(iconSpeedUp, "Speed Up", (ActionEvent e) -> {
            //
        });
        MenuPanel speedUp2 = new MenuPanel(iconSpeedUp2, "Speed Level Up", (ActionEvent e) -> {
            //
        });
        MenuPanel accidentIcon = new MenuPanel(iconAccident, "Accidents",( ActionEvent e) -> 
        {
            //code here
            
        }, minor, medium,major);
        
        MenuPanel speedIcon= new MenuPanel(iconSpeed, "Speed", ( ActionEvent e) ->
        {
        
        }, pauseIcon, speedUp, speedUp2);

        MenuPanel exitIcon = new MenuPanel(iconExit, "Exit", (ActionEvent e) ->
        {
            // exit the application within 
            //JOptionPane.showConfirmDialog(Main.this, "Are you sure you want to Exit?");
            System.exit(0);
        });
        
        MenuPanel trafficIcon = new MenuPanel(iconTraffic, "Traffic",(ActionEvent e) -> {
            
            //code here
        },morning,evening,Night);
        MenuPanel Mainmenu = new MenuPanel(iconMunu, "Menu",null,trafficIcon,accidentIcon,speedIcon,exitIcon);
              
        //add to menu
        addMenu(Mainmenu,trafficIcon,speedIcon,pauseIcon,exitIcon);
        
    }
    
    private void addMenu(MenuPanel...menu)
    {
        for(int i = 0; i < menu.length; i++)
        {
            jPanelMenus.add(menu[i]);
            
            // array of the submenue
            ArrayList<MenuPanel> subMenue = menu[i].getSubMenu();
            for(MenuPanel m: subMenue)
            {
                addMenu(m);
            }
            //jPanelMenu.revalidate();
        }
        jPanelMenu.revalidate();
    }
    
    private void demo(){
        Simulation sim = new Simulation();
//        sim.openMap("./src/KilleenMap.osm"); // pick the map
//        sim.startRenderer(8);// 8 is the scale
        sim.openMap("./src/MediumMap.osm");
        sim.startRenderer(4);
//        
//        sim.openMap("./src/KilleenTAMUCTbig.osm");
//        sim.startRenderer(6);

//        sim.openMap("./src/Austin.osm");
//        sim.startRenderer(1);
        sim.setCars(1000); // 200 is the amount of cars 
        boolean run = true;
        while(run){ //play for a long time
            sim.step(0.00016, .05);            
            try{
                
                TimeUnit.MILLISECONDS.sleep(20); //
            }
            catch(Exception ex)
            {
                System.out.println("TimeUnit.SECONDS.sleep(1)");
            }
 //           String pauseStr = sc.next();

 //           System.out.println("Frame "+i);
            sim.updateRenderer();
//            sim.setScale(i);
        }
//        sim.demo();
//        sim.startRenderer(1);
    }
    
    static void test()
    {
        Simulation simTest = new Simulation();
        simTest.openMap("./src/HomeMap.osm");
        simTest.startRenderer(1);
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelHeader = new javax.swing.JPanel();
        jPanelMenu = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanelMenus = new javax.swing.JPanel();
        jPanelBody = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelHeader.setBackground(new java.awt.Color(71, 72, 74));
        jPanelHeader.setPreferredSize(new java.awt.Dimension(400, 45));

        javax.swing.GroupLayout jPanelHeaderLayout = new javax.swing.GroupLayout(jPanelHeader);
        jPanelHeader.setLayout(jPanelHeaderLayout);
        jPanelHeaderLayout.setHorizontalGroup(
            jPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1012, Short.MAX_VALUE)
        );
        jPanelHeaderLayout.setVerticalGroup(
            jPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 45, Short.MAX_VALUE)
        );

        getContentPane().add(jPanelHeader, java.awt.BorderLayout.PAGE_START);

        jPanelMenu.setBackground(new java.awt.Color(174, 176, 177));
        jPanelMenu.setPreferredSize(new java.awt.Dimension(250, 405));

        jScrollPane1.setBorder(null);

        jPanelMenus.setBackground(new java.awt.Color(255, 255, 255));
        jPanelMenus.setLayout(new javax.swing.BoxLayout(jPanelMenus, javax.swing.BoxLayout.Y_AXIS));
        jScrollPane1.setViewportView(jPanelMenus);

        javax.swing.GroupLayout jPanelMenuLayout = new javax.swing.GroupLayout(jPanelMenu);
        jPanelMenu.setLayout(jPanelMenuLayout);
        jPanelMenuLayout.setHorizontalGroup(
            jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanelMenuLayout.setVerticalGroup(
            jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 598, Short.MAX_VALUE)
        );

        getContentPane().add(jPanelMenu, java.awt.BorderLayout.LINE_START);

        jPanelBody.setBackground(new java.awt.Color(255, 255, 255));
        jPanelBody.setLayout(new java.awt.BorderLayout());
        getContentPane().add(jPanelBody, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(1034, 699));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanelBody;
    private javax.swing.JPanel jPanelHeader;
    private javax.swing.JPanel jPanelMenu;
    private javax.swing.JPanel jPanelMenus;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
