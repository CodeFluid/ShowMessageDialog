# ShowMessageDialog
Pequeño tutorial para utilizar el showMessageDialog de la clase JOptionPane

# Capturas
![Formulario Principal] (/Capturas/FrmPrincipal.png)

![Ventana con mensaje normal] (/Capturas/Mensaje Normal.png)

![Ventana con mensaje normal, título y tipo de mensaje] (/Capturas/Mensaje Normal con Título y Tipo de Mensaje.png)

![Ventana con mensaje normal, título, tipo de mensaje e icono] (/Capturas/Mensaje Normal con Título, Tipo de Mensaje e Icono.png)

#Código
Primero importamos las librerías que contienen las clases del:
- **JOptionPane**
- **ImageIcon**

```sh
import javax.swing.ImageIcon;
import static javax.swing.JOptionPane.*;
```

Después colocamos el código para el botón normal los parámetros que contiene son:
- **Component parentComponent** - Aquí se coloca el componente que va a contener a la ventana (JFrame, JDialog, JInternalFrame, etc).
- **Message** - El mensaje que va a mostrar la ventana
```sh
showMessageDialog(this, "Esto es una ventana");
```
El siguiente método es la segunda forma del showMessageDialog que contiene 4 parámetros:
- **Component parentComponent** - Aquí se coloca el componente que va a contener a la ventana (JFrame, JDialog, JInternalFrame, etc).
- **Message** - El mensaje que va a mostrar la ventana.
- **Title** - El título personalizado del showMessageDialog.
- **typeMessage** - Es el tipo de mensaje que se mostrará lo único que cambia es el icono (INFORMATION_MESSAGE, WARNING_MESSAGE, ERROR_MESSAGE, QUESTION_MESSAGE).
```sh
showMessageDialog(this, "Esta es una ventana", "Mensaje Personalizado", WARNING_MESSAGE);
```
El tercer y último método contiene 5 parámetros:
- **Component parentComponent** - Aquí se coloca el componente que va a contener a la ventana (JFrame, JDialog, JInternalFrame, etc).
- **Message** - El mensaje que va a mostrar la ventana.
- **Title** - El título personalizado del showMessageDialog.
- **typeMessage** - Es el tipo de mensaje que se mostrará lo único que cambia es el icono (INFORMATION_MESSAGE, WARNING_MESSAGE, ERROR_MESSAGE, QUESTION_MESSAGE).
- **Icon** - Es un icono que nosotros podemos colocar en nuestra carpeta de recursos y colocarla dentro de la ventana.
```sh
showMessageDialog(this, "Esto es otra ventana", "Mensaje Personalizado", WARNING_MESSAGE, new ImageIcon(ShowMessageDialogs.class.getResource("showDialogSave.png")));
```
