import com.jogamp.opengl.*;
import com.jogamp.opengl.awt.GLCanvas;
import com.jogamp.opengl.util.FPSAnimator;

import javax.swing.*;

public class OpenGLExample implements GLEventListener {
    public static void main(String[] args) {
        // Criar uma janela com GLCanvas
        GLProfile profile = GLProfile.get(GLProfile.GL2);
        GLCapabilities capabilities = new GLCapabilities(profile);
        GLCanvas canvas = new GLCanvas(capabilities);
        canvas.addGLEventListener(new OpenGLExample());

        // Janela Swing
        JFrame frame = new JFrame("OpenGL Example");
        frame.getContentPane().add(canvas);
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        // Animação (60 FPS)
        FPSAnimator animator = new FPSAnimator(canvas, 60);
        animator.start();
    }

    @Override
    public void init(GLAutoDrawable drawable) {
        // Configurações iniciais
        GL2 gl = drawable.getGL().getGL2();
        gl.glClearColor(0, 0, 0, 1); // Cor de fundo (preto)
    }

    @Override
    public void dispose(GLAutoDrawable drawable) {
        // Limpar recursos (se necessário)
    }

    @Override
    public void display(GLAutoDrawable drawable) {
        GL2 gl = drawable.getGL().getGL2();
        gl.glClear(GL2.GL_COLOR_BUFFER_BIT);

        // Desenhar triângulo
        gl.glBegin(GL2.GL_TRIANGLES);
        gl.glColor3f(1, 0, 0); // Vermelho
        gl.glVertex2f(-0.5f, -0.5f); // Vértice 1
        gl.glColor3f(0, 1, 0); // Verde
        gl.glVertex2f(0.5f, -0.5f); // Vértice 2
        gl.glColor3f(0, 0, 1); // Azul
        gl.glVertex2f(0.0f, 0.5f); // Vértice 3
        gl.glEnd();

        // Desenhar quadrado
        gl.glBegin(GL2.GL_QUADS);
        gl.glColor3f(1, 1, 0); // Amarelo
        gl.glVertex2f(-0.2f, -0.2f); // Vértice 1
        gl.glVertex2f(0.2f, -0.2f); // Vértice 2
        gl.glVertex2f(0.2f, 0.2f); // Vértice 3
        gl.glVertex2f(-0.2f, 0.2f); // Vértice 4
        gl.glEnd();
    }

    @Override
    public void reshape(GLAutoDrawable drawable, int x, int y, int width, int height) {
        GL2 gl = drawable.getGL().getGL2();
        gl.glMatrixMode(GL2.GL_PROJECTION);
        gl.glLoadIdentity();
        gl.glOrtho(-1, 1, -1, 1, -1, 1); // Ajuste para coordenadas 2D
        gl.glMatrixMode(GL2.GL_MODELVIEW);
    }
}
