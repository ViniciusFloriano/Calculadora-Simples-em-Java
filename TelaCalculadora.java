import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import java.awt.Component;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.text.ParseException;
import javax.swing.ScrollPaneConstants;
import javax.swing.JTextField;
public class TelaCalculadora extends javax.swing.JFrame {

	private Calculos calcController;
	private EnumOperacao ultimaOperacao;
	private static final long serialVersionUID = 1L;

    public TelaCalculadora() {
        initComponents();
        calcController = new Calculos();
    }

    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        visorCalculador = new JTextField();
        botaoCE = new javax.swing.JButton();
        botao7 = new javax.swing.JButton();
        botao8 = new javax.swing.JButton();
        botao9 = new javax.swing.JButton();
        botao5 = new javax.swing.JButton();
        botao6 = new javax.swing.JButton();
        botao4 = new javax.swing.JButton();
        botao1 = new javax.swing.JButton();
        botao2 = new javax.swing.JButton();
        botao3 = new javax.swing.JButton();
        botao0 = new javax.swing.JButton();
        botaoVezes = new javax.swing.JButton();
        botaoDiv = new javax.swing.JButton();
        botaoMenos = new javax.swing.JButton();
        botaoMais = new javax.swing.JButton();
        botaoIgual = new javax.swing.JButton();
        botaoMod = new javax.swing.JButton();
        botaoVirgula = new JButton();
        
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setViewportView(visorCalculador);
        jScrollPane1.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        
        visorCalculador.setHorizontalAlignment(SwingConstants.RIGHT);
        visorCalculador.setFont(new Font("Tahoma", Font.BOLD, 26));
        visorCalculador.setText("0,00");
        
        botaoCE.setFont(new java.awt.Font("Ubuntu", 0, 24));
        botaoCE.setText("CE");
        botaoCE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoCEMouseClicked(evt);
            }
        });

        botao1.setFont(new java.awt.Font("Ubuntu", 0, 24));
        botao1.setText("1");
        botao1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botao1MouseClicked(evt);
            }
        });

        botao2.setFont(new java.awt.Font("Ubuntu", 0, 24));
        botao2.setText("2");
        botao2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botao2MouseClicked(evt);
            }
        });

        botao3.setFont(new java.awt.Font("Ubuntu", 0, 24));
        botao3.setText("3");
        botao3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botao3MouseClicked(evt);
            }
        });
        
        botao4.setFont(new java.awt.Font("Ubuntu", 0, 24));
        botao4.setText("4");
        botao4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botao4MouseClicked(evt);
            }
        });
        
        botao5.setFont(new java.awt.Font("Ubuntu", 0, 24));
        botao5.setText("5");
        botao5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botao5MouseClicked(evt);
            }
        });

        botao6.setFont(new java.awt.Font("Ubuntu", 0, 24));
        botao6.setText("6");
        botao6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botao6MouseClicked(evt);
            }
        });
        
        botao7.setFont(new java.awt.Font("Ubuntu", 0, 24));
        botao7.setText("7");
        botao7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botao7MouseClicked(evt);
            }
        });

        botao8.setFont(new java.awt.Font("Ubuntu", 0, 24));
        botao8.setText("8");
        botao8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botao8MouseClicked(evt);
            }
        });

        botao9.setFont(new java.awt.Font("Ubuntu", 0, 24));
        botao9.setText("9");
        botao9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botao9MouseClicked(evt);
            }
        });
     
        botao0.setFont(new java.awt.Font("Ubuntu", 0, 24));
        botao0.setText("0");
        botao0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botao0MouseClicked(evt);
            }
        });

        botaoVezes.setFont(new java.awt.Font("Ubuntu", 0, 24));
        botaoVezes.setText("*");
        botaoVezes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoVezesMouseClicked(evt);
            }
        });

        botaoDiv.setFont(new java.awt.Font("Ubuntu", 0, 24));
        botaoDiv.setText("/");
        botaoDiv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoDivMouseClicked(evt);
            }
        });

        botaoMenos.setFont(new java.awt.Font("Ubuntu", 0, 24));
        botaoMenos.setText("-");
        botaoMenos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoMenosMouseClicked(evt);
            }
        });

        botaoMais.setFont(new java.awt.Font("Ubuntu", 0, 24));
        botaoMais.setText("+");
        botaoMais.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoMaisMouseClicked(evt);
            }
        });

        botaoIgual.setFont(new java.awt.Font("Ubuntu", 0, 24));
        botaoIgual.setText("=");
        botaoIgual.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoIgualMouseClicked(evt);
            }
        });
        
        botaoMod.setFont(new java.awt.Font("Ubuntu", 0, 24));
        botaoMod.setText("Mod");
        botaoMod.addMouseListener(new MouseAdapter() {
        	public void mouseClicked(java.awt.event.MouseEvent evt) {
        		botaoModMouseClicked(evt);
        	}
        });
        
        botaoVirgula.setText(",");
        botaoVirgula.setFont(new Font("Dialog", Font.PLAIN, 24));
        botaoVirgula.addMouseListener(new MouseAdapter() {
        	public void mouseClicked(java.awt.event.MouseEvent evt) {
        		botaoVirgulaMouseClicked(evt);
        	}
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1Layout.setHorizontalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING)
        				.addComponent(jScrollPane1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(botaoCE, GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
        						.addGroup(jPanel1Layout.createSequentialGroup()
        							.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        								.addComponent(botao7, GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
        								.addComponent(botao4, GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE))
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        								.addComponent(botao5, GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
        								.addComponent(botao8, GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)))
        						.addGroup(jPanel1Layout.createSequentialGroup()
        							.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING)
        								.addComponent(botao0, GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
        								.addComponent(botao1, GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE))
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        								.addComponent(botaoVirgula, GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
        								.addComponent(botao2, GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE))))
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        						.addGroup(jPanel1Layout.createSequentialGroup()
        							.addComponent(botao3, GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(botaoMais, GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE))
        						.addComponent(botaoIgual, GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
        						.addGroup(jPanel1Layout.createSequentialGroup()
        							.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING)
        								.addGroup(jPanel1Layout.createSequentialGroup()
        									.addComponent(botao6, GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
        									.addPreferredGap(ComponentPlacement.RELATED)
        									.addComponent(botaoMenos, GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE))
        								.addGroup(jPanel1Layout.createSequentialGroup()
        									.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING)
        										.addComponent(botaoMod, GroupLayout.PREFERRED_SIZE, 77, Short.MAX_VALUE)
        										.addComponent(botao9, GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE))
        									.addPreferredGap(ComponentPlacement.RELATED)
        									.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        										.addComponent(botaoVezes, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
        										.addComponent(botaoDiv, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE))))
        							.addGap(2)))))
        			.addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
        			.addGap(24)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING, false)
        				.addComponent(botaoCE, GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
        				.addComponent(botaoMod, GroupLayout.PREFERRED_SIZE, 33, Short.MAX_VALUE)
        				.addComponent(botaoVezes, GroupLayout.PREFERRED_SIZE, 33, Short.MAX_VALUE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE, false)
        				.addComponent(botao7, GroupLayout.PREFERRED_SIZE, 33, Short.MAX_VALUE)
        				.addComponent(botao8, GroupLayout.PREFERRED_SIZE, 33, Short.MAX_VALUE)
        				.addComponent(botao9, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
        				.addComponent(botaoDiv, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(botao5, GroupLayout.PREFERRED_SIZE, 33, Short.MAX_VALUE)
        				.addComponent(botao6, GroupLayout.PREFERRED_SIZE, 33, Short.MAX_VALUE)
        				.addComponent(botao4, GroupLayout.PREFERRED_SIZE, 33, Short.MAX_VALUE)
        				.addComponent(botaoMenos, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(botao1, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
        				.addComponent(botao2, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
        				.addComponent(botao3, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
        				.addComponent(botaoMais, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(botao0, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
        				.addComponent(botaoVirgula, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
        				.addComponent(botaoIgual, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
        			.addContainerGap())
        );
        jPanel1Layout.linkSize(SwingConstants.VERTICAL, new Component[] {botao7, botao8, botao9});
        jPanel1.setLayout(jPanel1Layout);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
            layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
                javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }
    
    private void botaoCEMouseClicked(java.awt.event.MouseEvent evt){
        resetar();
    }

    private void botao1MouseClicked(java.awt.event.MouseEvent evt) {
    	digita("1");         
    }

    private void botao2MouseClicked(java.awt.event.MouseEvent evt) {
    	digita("2");       	 
    }

    private void botao3MouseClicked(java.awt.event.MouseEvent evt) {
    	digita("3");      	 
    }
    
    private void botao4MouseClicked(java.awt.event.MouseEvent evt){
    	digita("4");         
    }

    private void botao5MouseClicked(java.awt.event.MouseEvent evt){
    	digita("5");         
    }

    private void botao6MouseClicked(java.awt.event.MouseEvent evt){
    	digita("6");         
    }
    
    private void botao7MouseClicked(java.awt.event.MouseEvent evt){
    	digita("7");		 
    }

    private void botao8MouseClicked(java.awt.event.MouseEvent evt){
    	digita("8");         
    }

    private void botao9MouseClicked(java.awt.event.MouseEvent evt){
    	digita("9");         
    }

    private void botao0MouseClicked(java.awt.event.MouseEvent evt) {
        digita("0");  		   
    }
    
    private void botaoVezesMouseClicked(java.awt.event.MouseEvent evt){
    	calcController.realizaOperacao(EnumOperacao.MULTIPLICACAO, stringToDouble(visorCalculador.getText()));
    	ultimaOperacao = EnumOperacao.MULTIPLICACAO;
    	limpar();		
    }

    private void botaoDivMouseClicked(java.awt.event.MouseEvent evt){
    	calcController.realizaOperacao(EnumOperacao.DIVISAO, stringToDouble(visorCalculador.getText()));
    	ultimaOperacao = EnumOperacao.DIVISAO;
    	limpar();        
    }

    private void botaoMenosMouseClicked(java.awt.event.MouseEvent evt){
    	calcController.realizaOperacao(EnumOperacao.SUBTRACAO, stringToDouble(visorCalculador.getText()));
    	ultimaOperacao = EnumOperacao.SUBTRACAO;
    	limpar();        
    }

    private void botaoMaisMouseClicked(java.awt.event.MouseEvent evt) {
    	calcController.realizaOperacao(EnumOperacao.SOMA, stringToDouble(visorCalculador.getText()));
    	ultimaOperacao = EnumOperacao.SOMA;
    	limpar();
    }

    private void botaoModMouseClicked(java.awt.event.MouseEvent evt) {
    	digita("%");       	
    }
    
    private void botaoVirgulaMouseClicked(java.awt.event.MouseEvent evt) {
        digita(",");     	
    }
    
   private void botaoIgualMouseClicked(java.awt.event.MouseEvent evt) {
	   calcController.realizaOperacao(ultimaOperacao, stringToDouble(visorCalculador.getText()));
	   	visorCalculador.setText(doubleToString(calcController.getTotal()));
    }
    
    private String doubleToString(Double numero) {
    	if (numero != null) {
    		DecimalFormat formato = new DecimalFormat("##,###,###,##0.00", new DecimalFormatSymbols());
    		formato.setParseBigDecimal(true);
    		return formato.format(numero);
    	}
    	return "";
    }
    
    private Double stringToDouble(String numero) {
    	NumberFormat nf = NumberFormat.getInstance();
    	Double dv = null;
    	try {
    		dv = nf.parse(numero).doubleValue();
    	} catch (ParseException ex) {
    		
    	}
    	return dv;
    }
    
    private void digita(String caractere) {
    	if (visorCalculador.getText().equals("0,00")) {
    		visorCalculador.setText(caractere);
    	}else {
    		if (caractere.equals(",") && visorCalculador.getText().contains(",")) {
    			
    		}else {
    			visorCalculador.setText(visorCalculador.getText().concat(caractere));
    		}
    	}
    }
    
    private void limpar() {
    	visorCalculador.setText("");
    }
    
    private void resetar() {
    	visorCalculador.setText("0,00");
    }


    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info :
            javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaCalculadora.class.getName()).log(
            java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCalculadora.class.getName()).log(
            java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCalculadora.class.getName()).log(
            java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCalculadora.class.getName()).log(
            java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCalculadora().setVisible(true);
            }
        });
    }
    
    private javax.swing.JButton botao0;
    private javax.swing.JButton botao1;
    private javax.swing.JButton botao2;
    private javax.swing.JButton botao3;
    private javax.swing.JButton botao4;
    private javax.swing.JButton botao5;
    private javax.swing.JButton botao6;
    private javax.swing.JButton botao7;
    private javax.swing.JButton botao8;
    private javax.swing.JButton botao9;
    private javax.swing.JButton botaoCE;
    private javax.swing.JButton botaoDiv;
    private javax.swing.JButton botaoIgual;
    private javax.swing.JButton botaoMais;
    private javax.swing.JButton botaoMenos;
    private javax.swing.JButton botaoVezes;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField visorCalculador;
    private javax.swing.JButton botaoMod;
    private javax.swing.JButton botaoVirgula;
}