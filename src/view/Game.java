package view;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Game extends JPanel{
	private FrameGame jl_frame; //Khung ngoài
	private JLabel jl_game_frame;//Khung trong
	private OnGameButton jb_return;
	private BoardGame board_game;
	private OnGameButton jb_mainmenu;
	private OnGameButton jb_pause;
	private OnGameButton jb_newgame;
	private SoundButton jb_sound;
	private SoundEffect se;
	public Game(int w, int h) {
		setBounds(100, 100, 800, 600);
		setBorder(new EmptyBorder(5, 5, 5, 5));
		setLayout(null);
		
		board_game = new BoardGame(w, h);
		board_game.setBounds(60,60,480,480);
		this.add(board_game);
		
		jb_newgame = new OnGameButton("New Game");
		jb_newgame.setBounds(605, 290, 150, 50);
		jb_newgame.setContentAreaFilled(false);
		jb_newgame.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				jb_newgame.setLight(false);
				jb_newgame.repaint();
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				jb_newgame.setLight(true);
				se = new SoundEffect(".//src//resources//sounds//enter_soundtrack.wav");
				se.play();
				jb_newgame.repaint();
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		this.add(jb_newgame);
		
		jb_pause = new OnGameButton("Pause");
		jb_pause.setBounds(605, 355, 150, 50);
		jb_pause.setContentAreaFilled(false);
		jb_pause.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				jb_pause.setLight(false);
				jb_pause.repaint();
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				jb_pause.setLight(true);
				se = new SoundEffect(".//src//resources//sounds//enter_soundtrack.wav");
				se.play();
				jb_pause.repaint();
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		this.add(jb_pause);
		
		jb_return = new OnGameButton("Return");
		jb_return.setBounds(605, 420, 150, 50);
		jb_return.setContentAreaFilled(false);
		jb_return.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				jb_return.setLight(false);
				jb_return.repaint();
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				jb_return.setLight(true);
				se = new SoundEffect(".//src//resources//sounds//enter_soundtrack.wav");
				se.play();
				jb_return.repaint();
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		this.add(jb_return);
		
		jb_mainmenu = new OnGameButton("Main Menu");
		jb_mainmenu.setBounds(605, 485, 150, 50);
		jb_mainmenu.setContentAreaFilled(false);
		jb_mainmenu.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				jb_mainmenu.setLight(false);
				jb_mainmenu.repaint();
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				jb_mainmenu.setLight(true);
				se = new SoundEffect(".//src//resources//sounds//enter_soundtrack.wav");
				se.play();
				jb_mainmenu.repaint();
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		this.add(jb_mainmenu);
		
		jb_sound = new SoundButton();
		jb_sound.setBounds(720, 30, 50, 50);
		jb_sound.setContentAreaFilled(false);
		jb_sound.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				jb_sound.setLight(false);
				jb_sound.repaint();
				System.out.println("tắt ");
				
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				jb_sound.setLight(true);
				jb_sound.repaint();
				System.out.println("sáng");
				
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		this.add(jb_sound);
		
		
		
		jl_frame = new FrameGame();
		jl_frame.setBounds(0, 0, 800, 600);
		this.add(jl_frame);
	}
	public JButton getJb_return() {
		return jb_return;
	}
	public void setJb_return(OnGameButton jb_return) {
		this.jb_return = jb_return;
	}
	public JButton getJb_mainmenu() {
		return jb_mainmenu;
	}
	public void setJb_mainmenu(OnGameButton jb_mainmenu) {
		this.jb_mainmenu = jb_mainmenu;
	}
	public JButton getJb_pause() {
		return jb_pause;
	}
	public void setJb_pause(OnGameButton jb_pause) {
		this.jb_pause = jb_pause;
	}
	public JButton getJb_newgame() {
		return jb_newgame;
	}
	public void setJb_newgame(OnGameButton jb_newgame) {
		this.jb_newgame = jb_newgame;
	}
	public JButton getJb_sound() {
		return jb_sound;
	}
	public void setJb_sound(SoundButton jb_sound) {
		this.jb_sound = jb_sound;
	}
	
	
	
}
