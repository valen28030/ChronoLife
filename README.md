# ChronoLife
<p align="justify">Una Aplicación para Registrar y Visualizar tu Historia Personal.</p>
  <p> <strong>Android Studio.</strong></p>
  <p> <strong>Lenguajes: Java y XML.</strong></p>
        <p>&nbsp;</p>
        
 ## ¿Qué es ChronoLife?
  <p align="justify">ChronoLife es una aplicación diseñada para ayudarte a registrar y visualizar tu historia personal de una manera simple y efectiva. Con ChronoLife, puedes seleccionar fácilmente fechas importantes en tu vida y ver cuántos días han pasado desde entonces. Ya sea tu cumpleaños, aniversarios, eventos importantes o cualquier fecha significativa, ChronoLife te permite mantener un registro y reflexionar sobre el tiempo transcurrido desde esos momentos especiales.</p>
        <p>&nbsp;</p>
        
 ## Funcionamiento de ChronoLife
<p align="justify"> La aplicación ChronoLife consta de dos elementos principales: una interfaz de usuario intuitiva y un motor de cálculo de días vividos.</p>
<p align="justify"><strong>1. Interfaz de Usuario Intuitiva</strong></p>
        <p align="justify">La interfaz de ChronoLife está diseñada para ser fácil de usar y estéticamente atractiva. Al abrir la aplicación, se te presenta una pantalla con un título llamativo "ChronoLife", seguido de un calendario interactivo y un área para mostrar la fecha seleccionada y los días vividos.</p>
        <p align="justify">El calendario se muestra automáticamente al abrir la aplicación, lo que te permite seleccionar la fecha directamente sin necesidad de botones adicionales.</p>
        <p align="justify">Una vez seleccionada la fecha, se muestra debajo del calendario y se calcula automáticamente la cantidad de días vividos desde entonces.</p>

 <p>&nbsp;</p>
<p align="justify"><strong>2. Motor de Cálculo de Días Vividos</strong></p>
<p align="justify">Detrás de la interfaz de usuario, ChronoLife utiliza un motor de cálculo para determinar la cantidad de días vividos entre la fecha seleccionada y la fecha actual.</p>
<p align="justify">Cuando seleccionas una fecha en el calendario, la aplicación realiza automáticamente los cálculos necesarios y muestra el resultado en la pantalla.</p>
<img src="https://github.com/valen28030/Tarjeta_Visita/assets/167770750/aed3a25a-56ef-4689-b07c-48a83e4cf99c" alt="Tarjeta de Presentación" width="300">
        <p>&nbsp;</p>
        
 ## Estructura de código
  <p align="justify">El código de ChronoLife se compone de dos archivos principales: MainActivity.java y activity_main.xml.</p>
  
### activity_main.xml:

**1. Diseño de la Interfaz de Usuario** 
   - Se utiliza un RelativeLayout como contenedor principal para organizar los elementos en la pantalla.
   - Se definen TextViews para mostrar el título, la fecha seleccionada y la respuesta de días vividos.
   - Se incluye un DatePicker para permitir la selección de fechas.
     
```sh
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="@drawable/fondo">

    <TextView
        android:id="@+id/text_title"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="ChronoLife"
        <!-- Otros atributos de estilo -->
        />

    <DatePicker
        android:id="@+id/datePicker"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        <!-- Otros atributos de estilo -->
        />

    <TextView
        android:id="@+id/text_fecha_seleccionada"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Fecha Seleccionada: "
        <!-- Otros atributos de estilo -->
        />

    <TextView
        android:id="@+id/text_respuesta"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        <!-- Otros atributos de estilo -->
        />
</RelativeLayout>
```
<p>&nbsp;</p>

### MainActivity.java:

**1. Inicialización de la Interfaz de Usuario** 
   - En el método onCreate(), se inicializan los elementos de la interfaz de usuario, como los TextViews y el DatePicker, utilizando sus IDs definidos en el archivo XML.
     
```sh
text_respuesta = findViewById(R.id.text_respuesta);
text_fecha_seleccionada = findViewById(R.id.text_fecha_seleccionada);
```
<p>&nbsp;</p>

**2. Mostrar el Calendario Automáticamente** 
   - En el método showDatePicker(), se configura el DatePicker para que se muestre automáticamente al abrir la aplicación. Esto se logra llamando al método datePicker.init() con los parámetros necesarios.
     
```sh
DatePicker datePicker = findViewById(R.id.datePicker);
datePicker.init(/* parámetros de fecha actual */, (view, year, month, dayOfMonth) -> {
    // Manejo de la selección de fecha
});
```
<p>&nbsp;</p>

**3. Cálculo de Días Vividos** 
   - En el método calcularDias(), se calcula la diferencia en días entre la fecha seleccionada y la fecha actual utilizando objetos Calendar y operaciones matemáticas. Luego, se muestra el resultado en el TextView correspondiente.
     
```sh
long diferenciaEnMilisegundos = /* diferencia en milisegundos */;
long diferenciaEnDias = /* diferencia en días */;
text_respuesta.setText("Días vividos: " + diferenciaEnDias);
```   
<p>&nbsp;</p>
        
 ## Requisitos
  <ul>
            <li>Dispositivo móvil con sistema operativo iOS/Android</li>
            <li>Conexión a internet para compartir la tarjeta de presentación</li>
        </ul>
        <p>&nbsp;</p>
        
 ## Créditos
  <ul>
            <li><strong>Desarrollador:</strong> Carlos Valencia Sánchez</li>
            <li><strong>Diseñador de App:</strong> Carlos Valencia Sánchez</li>
            <li><strong>Artista Gráfico:</strong> Carlos Valencia Sánchez</li>
        </ul>
        <p>&nbsp;</p>
        
 ## Contacto
  <p align="justify">Para obtener soporte técnico, reportar errores o proporcionar comentarios, no dudes en contactar.</p>
        <p>&nbsp;</p>
<p align="justify">¡Esperamos que disfrutes utilizando la app de ChronoLife para calcular los dias vividos desde tus feschas mas importantes!</p>
        <hr>
        <p align="justify">Esta es una descripción general de la funcionalidad y contenido de la aplicación. Para obtener instrucciones detalladas sobre cómo utilizar cada característica, consulta la documentación incluida en la aplicación o comunícate con el desarrollador.</p>
</div>
