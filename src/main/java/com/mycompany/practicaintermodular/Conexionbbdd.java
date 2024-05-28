/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicaintermodular;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Esta clase se encarga de conectar a una base de datos MySQL y realizar
 * consultas para obtener información sobre planetas y satélites del sistema solar.
 * 
 * La clase tiene definidas varias sentencias SQL que se utilizan para realizar
 * las consultas a la base de datos. Además, tiene métodos para ejecutar
 * estas consultas y devolver los resultados en forma de arreglos de strings.
 * 
 * Los métodos de esta clase son:
 * 
 * - `conectarConsultaMercurio()`: Obtiene los datos del planeta Mercurio.
 * - `conectarConsultaVenus()`: Obtiene los datos del planeta Venus.
 * - `conectarConsultaTierra()`: Obtiene los datos del planeta Tierra.
 * - `conectarConsultaMarte()`: Obtiene los datos del planeta Marte.
 * - `conectarConsultaJúpiter()`: Obtiene los datos del planeta Júpiter.
 * - `conectarConsultaSaturno()`: Obtiene los datos del planeta Saturno.
 * - `conectarConsultaUrano()`: Obtiene los datos del planeta Urano.
 * - `conectarConsultaNeptuno()`: Obtiene los datos del planeta Neptuno.
 * - `conectarConsultaLuna()`: Obtiene los datos del satélite Luna.
 * - `conectarConsultaFobos()`: Obtiene los datos del satélite Fobos.
 * - `conectarConsultaDeimos()`: Obtiene los datos del satélite Deimos.
 * - `conectarConsultaÍo()`: Obtiene los datos del satélite Ío.
 * - `conectarConsultaEuropa()`: Obtiene los datos del satélite Europa.
 * - `conectarConsultaGanimedes()`: Obtiene los datos del satélite Ganimedes.
 * - `conectarConsultaCalisto()`: Obtiene los datos del satélite Calisto.
 * - `conectarConsultaTitán()`: Obtiene los datos del satélite Titán.
 * - `conectarConsultaEncélado()`: Obtiene los datos del satélite Encélado.
 * - `conectarConsultaTitania()`: Obtiene los datos del satélite Titania.
 * - `conectarConsultaOberón()`: Obtiene los datos del satélite Oberón.
 * 
 * @author Usuario
 */
public class Conexionbbdd {

// Configuración de la conexión a la base de datos MySQL
    String url = "jdbc:mysql://localhost:3306/practica_intermodular";
    String usuario = "root";
    String contraseña = "Med@c";

// Sentencias SQL
    String sqlMarte = "select * from planetas where Nombre= 'Marte'";
    String sqlMercurio = "select * from planetas where Nombre= 'Mercurio'";
    String sqlVenus = "select * from planetas where Nombre= 'Venus'";
    String sqlTierra = "select * from planetas where Nombre= 'Tierra'";
    String sqlJúpiter = "select * from planetas where Nombre= 'Júpiter'";
    String sqlSaturno = "select * from planetas where Nombre= 'Saturno'";
    String sqlUrano = "select * from planetas where Nombre= 'Urano'";
    String sqlNeptuno = "select * from planetas where Nombre= 'Neptuno'";

    String sqlLuna = "select * from satelites where Nombre='Luna'";
    String sqlFobos = "select * from satelites where Nombre='Fobos'";
    String sqlDeimos = "select * from satelites where Nombre='Deimos'";
    String sqlÍo = "select * from satelites where Nombre='Ío'";
    String sqlEuropa = "select * from satelites where Nombre='Europa'";
    String sqlGanimedes = "select * from satelites where Nombre='Ganimedes'";
    String sqlCalisto = "select * from satelites where Nombre='Calisto'";
    String sqlTitán = "select * from satelites where Nombre='Titán'";
    String sqlEncélado = "select * from satelites where Nombre='Encélado'";
    String sqlTitania = "select * from satelites where Nombre='Titania'";
    String sqlOberón = "select * from satelites where Nombre='Oberón'";

    // Metodos para consultar:
    /**
     * Obtiene los datos del planeta Mercurio de la base de datos.
     * 
     * @return Un arreglo de strings con los datos del planeta Mercurio.
     * @exception SQLException Si ocurre un error al realizar la consulta a la base de datos.
     */
    public String[] conectarConsultaMercurio() {

        // 1. crear array
        String[] datosMercurio = new String[7];
        try {
            // 2. Conectar

            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
            Statement statement = conexion.createStatement();
            // 3. lanzar query:
            ResultSet resultados = statement.executeQuery(sqlMercurio);

            // 4. coger datos y guardarlos en el array:
            while (resultados.next()) {
                // Obtener los valores de las columnas
                datosMercurio[0] = resultados.getString("Radio");
                datosMercurio[1] = resultados.getString("Distancia_Media_al_Sol");
                datosMercurio[2] = resultados.getString("Periodo_Orbital");
                datosMercurio[3] = resultados.getString("Temperatura_Media");
                datosMercurio[4] = resultados.getString("Tipo_de_Planeta");
                datosMercurio[5] = resultados.getString("Numero_de_Satelites");
                datosMercurio[6] = resultados.getString("Fecha_creacion");

            }
            resultados.close();
            statement.close();
            conexion.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        //return array:
        return datosMercurio;

    }
    /**
 * Obtiene los datos del planeta Venus de la base de datos.
 * 
 * @return Un arreglo de strings con los datos del planeta Venus.
 * @exception SQLException Si ocurre un error al realizar la consulta a la base de datos.
 */
    public String[] conectarConsultaVenus() {

        // 1. crear array
        String[] datosVenus = new String[7];
        try {
            // 2. Conectar

            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
            Statement statement = conexion.createStatement();
            // 3. lanzar query:
            ResultSet resultados = statement.executeQuery(sqlVenus);

            // 4. coger datos y guardarlos en el array:
            while (resultados.next()) {
                // Obtener los valores de las columnas
                datosVenus[0] = resultados.getString("Radio");
                datosVenus[1] = resultados.getString("Distancia_Media_al_Sol");
                datosVenus[2] = resultados.getString("Periodo_Orbital");
                datosVenus[3] = resultados.getString("Temperatura_Media");
                datosVenus[4] = resultados.getString("Tipo_de_Planeta");
                datosVenus[5] = resultados.getString("Numero_de_Satelites");
                datosVenus[6] = resultados.getString("Fecha_creacion");

            }
            resultados.close();
            statement.close();
            conexion.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        //return array:
        return datosVenus;

    }
    /**
 * Obtiene los datos del planeta Tierra de la base de datos.
 * 
 * @return Un arreglo de strings con los datos del planeta Tierra.
 * @exception SQLException Si ocurre un error al realizar la consulta a la base de datos.
 */
    public String[] conectarConsultaTierra() {

        // 1. crear array
        String[] datosTierra = new String[7];
        try {
            // 2. Conectar

            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
            Statement statement = conexion.createStatement();
            // 3. lanzar query:
            ResultSet resultados = statement.executeQuery(sqlTierra);

            // 4. coger datos y guardarlos en el array:
            while (resultados.next()) {
                // Obtener los valores de las columnas
                datosTierra[0] = resultados.getString("Radio");
                datosTierra[1] = resultados.getString("Distancia_Media_al_Sol");
                datosTierra[2] = resultados.getString("Periodo_Orbital");
                datosTierra[3] = resultados.getString("Temperatura_Media");
                datosTierra[4] = resultados.getString("Tipo_de_Planeta");
                datosTierra[5] = resultados.getString("Numero_de_Satelites");
                datosTierra[6] = resultados.getString("Fecha_creacion");

            }
            resultados.close();
            statement.close();
            conexion.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        //return array:
        return datosTierra;

    }
    /**
 * Obtiene los datos del planeta Marte de la base de datos.
 * 
 * @return Un arreglo de strings con los datos del planeta Marte.
 * @exception SQLException Si ocurre un error al realizar la consulta a la base de datos.
 */
    public String[] conectarConsultaMarte() {

        // 1. crear array
        String[] datosMarte = new String[7];
        try {
            // 2. Conectar

            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
            Statement statement = conexion.createStatement();
            // 3. lanzar query:
            ResultSet resultados = statement.executeQuery(sqlMarte);

            // 4. coger datos y guardarlos en el array:
            while (resultados.next()) {
                // Obtener los valores de las columnas
                datosMarte[0] = resultados.getString("Radio");
                datosMarte[1] = resultados.getString("Distancia_Media_al_Sol");
                datosMarte[2] = resultados.getString("Periodo_Orbital");
                datosMarte[3] = resultados.getString("Temperatura_Media");
                datosMarte[4] = resultados.getString("Tipo_de_Planeta");
                datosMarte[5] = resultados.getString("Numero_de_Satelites");
                datosMarte[6] = resultados.getString("Fecha_creacion");

            }
            resultados.close();
            statement.close();
            conexion.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        //return array:
        return datosMarte;

    }
    /**
 * Obtiene los datos del planeta Júpiter de la base de datos.
 * 
 * @return Un arreglo de strings con los datos del planeta Júpiter.
 * @exception SQLException Si ocurre un error al realizar la consulta a la base de datos.
 */
    public String[] conectarConsultaJúpiter() {

        // 1. crear array
        String[] datosJúpiter = new String[7];
        try {
            // 2. Conectar

            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
            Statement statement = conexion.createStatement();
            // 3. lanzar query:
            ResultSet resultados = statement.executeQuery(sqlJúpiter);

            // 4. coger datos y guardarlos en el array:
            while (resultados.next()) {
                // Obtener los valores de las columnas
                datosJúpiter[0] = resultados.getString("Radio");
                datosJúpiter[1] = resultados.getString("Distancia_Media_al_Sol");
                datosJúpiter[2] = resultados.getString("Periodo_Orbital");
                datosJúpiter[3] = resultados.getString("Temperatura_Media");
                datosJúpiter[4] = resultados.getString("Tipo_de_Planeta");
                datosJúpiter[5] = resultados.getString("Numero_de_Satelites");
                datosJúpiter[6] = resultados.getString("Fecha_creacion");

            }
            resultados.close();
            statement.close();
            conexion.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        //return array:
        return datosJúpiter;

    }
    /**
 * Obtiene los datos del planeta Saturno de la base de datos.
 * 
 * @return Un arreglo de strings con los datos del planeta Saturno.
 * @exception SQLException Si ocurre un error al realizar la consulta a la base de datos.
 */
    public String[] conectarConsultaSaturno() {

        // 1. crear array
        String[] datosSaturno = new String[7];
        try {
            // 2. Conectar

            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
            Statement statement = conexion.createStatement();
            // 3. lanzar query:
            ResultSet resultados = statement.executeQuery(sqlSaturno);

            // 4. coger datos y guardarlos en el array:
            while (resultados.next()) {
                // Obtener los valores de las columnas
                datosSaturno[0] = resultados.getString("Radio");
                datosSaturno[1] = resultados.getString("Distancia_Media_al_Sol");
                datosSaturno[2] = resultados.getString("Periodo_Orbital");
                datosSaturno[3] = resultados.getString("Temperatura_Media");
                datosSaturno[4] = resultados.getString("Tipo_de_Planeta");
                datosSaturno[5] = resultados.getString("Numero_de_Satelites");
                datosSaturno[6] = resultados.getString("Fecha_creacion");

            }
            resultados.close();
            statement.close();
            conexion.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        //return array:
        return datosSaturno;

    }
/**
 * Obtiene los datos del planeta Urano de la base de datos.
 * 
 * @return Un arreglo de strings con los datos del planeta Urano.
 * @exception SQLException Si ocurre un error al realizar la consulta a la base de datos.
 */
    public String[] conectarConsultaUrano() {

        // 1. crear array
        String[] datosUrano = new String[7];
        try {
            // 2. Conectar

            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
            Statement statement = conexion.createStatement();
            // 3. lanzar query:
            ResultSet resultados = statement.executeQuery(sqlUrano);

            // 4. coger datos y guardarlos en el array:
            while (resultados.next()) {
                // Obtener los valores de las columnas
                datosUrano[0] = resultados.getString("Radio");
                datosUrano[1] = resultados.getString("Distancia_Media_al_Sol");
                datosUrano[2] = resultados.getString("Periodo_Orbital");
                datosUrano[3] = resultados.getString("Temperatura_Media");
                datosUrano[4] = resultados.getString("Tipo_de_Planeta");
                datosUrano[5] = resultados.getString("Numero_de_Satelites");
                datosUrano[6] = resultados.getString("Fecha_creacion");

            }
            resultados.close();
            statement.close();
            conexion.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        //return array:
        return datosUrano;

    }
/**
 * Obtiene los datos del planeta Neptuno de la base de datos.
 * 
 * @return Un arreglo de strings con los datos del planeta Neptuno.
 * @exception SQLException Si ocurre un error al realizar la consulta a la base de datos.
 */
    public String[] conectarConsultaNeptuno() {

        // 1. crear array
        String[] datosNeptuno = new String[7];
        try {
            // 2. Conectar

            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
            Statement statement = conexion.createStatement();
            // 3. lanzar query:
            ResultSet resultados = statement.executeQuery(sqlNeptuno);

            // 4. coger datos y guardarlos en el array:
            while (resultados.next()) {
                // Obtener los valores de las columnas
                datosNeptuno[0] = resultados.getString("Radio");
                datosNeptuno[1] = resultados.getString("Distancia_Media_al_Sol");
                datosNeptuno[2] = resultados.getString("Periodo_Orbital");
                datosNeptuno[3] = resultados.getString("Temperatura_Media");
                datosNeptuno[4] = resultados.getString("Tipo_de_Planeta");
                datosNeptuno[5] = resultados.getString("Numero_de_Satelites");
                datosNeptuno[6] = resultados.getString("Fecha_creacion");

            }
            resultados.close();
            statement.close();
            conexion.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        //return array:
        return datosNeptuno;

    }

    //===================== SATELITES ===============================
    /**
 * Obtiene los datos del satélite Luna de la base de datos.
 * 
 * @return Un arreglo de strings con los datos del satélite Luna.
 * @exception SQLException Si ocurre un error al realizar la consulta a la base de datos.
 */
    public String[] conectarConsultaLuna() {

        // 1. crear array
        String[] datosLuna = new String[7];
        try {
            // 2. Conectar

            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
            Statement statement = conexion.createStatement();
            // 3. lanzar query:
            ResultSet resultados = statement.executeQuery(sqlLuna);

            // 4. coger datos y guardarlos en el array:
            while (resultados.next()) {
                // Obtener los valores de las columnas
                datosLuna[0] = resultados.getString("Planeta");
                datosLuna[1] = resultados.getString("Radio");
                datosLuna[2] = resultados.getString("Distancia_Media_a_su_Planeta");
                datosLuna[3] = resultados.getString("Periodo_Orbital");
                datosLuna[4] = resultados.getString("Temperatura_Media");
                datosLuna[5] = resultados.getString("Tipo_de_Cuerpo");
                datosLuna[6] = resultados.getString("Fecha_creacion");

            }
            resultados.close();
            statement.close();
            conexion.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        //return array:
        return datosLuna;

    }
/**
 * Obtiene los datos del satélite Fobos de la base de datos.
 * 
 * @return Un arreglo de strings con los datos del satélite Fobos.
 * @exception SQLException Si ocurre un error al realizar la consulta a la base de datos.
 */
    public String[] conectarConsultaFobos() {

        // 1. crear array
        String[] datosFobos = new String[7];
        try {
            // 2. Conectar

            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
            Statement statement = conexion.createStatement();
            // 3. lanzar query:
            ResultSet resultados = statement.executeQuery(sqlFobos);

            // 4. coger datos y guardarlos en el array:
            while (resultados.next()) {
                // Obtener los valores de las columnas
                datosFobos[0] = resultados.getString("Planeta");
                datosFobos[1] = resultados.getString("Radio");
                datosFobos[2] = resultados.getString("Distancia_Media_a_su_Planeta");
                datosFobos[3] = resultados.getString("Periodo_Orbital");
                datosFobos[4] = resultados.getString("Temperatura_Media");
                datosFobos[5] = resultados.getString("Tipo_de_Cuerpo");
                datosFobos[6] = resultados.getString("Fecha_creacion");

            }
            resultados.close();
            statement.close();
            conexion.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        //return array:
        return datosFobos;

    }
/**
 * Obtiene los datos del satélite Deimos de la base de datos.
 * 
 * @return Un arreglo de strings con los datos del satélite Deimos.
 * @exception SQLException Si ocurre un error al realizar la consulta a la base de datos.
 */
    public String[] conectarConsultaDeimos() {

        // 1. crear array
        String[] datosDeimos = new String[7];
        try {
            // 2. Conectar

            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
            Statement statement = conexion.createStatement();
            // 3. lanzar query:
            ResultSet resultados = statement.executeQuery(sqlDeimos);

            // 4. coger datos y guardarlos en el array:
            while (resultados.next()) {
                // Obtener los valores de las columnas
                datosDeimos[0] = resultados.getString("Planeta");
                datosDeimos[1] = resultados.getString("Radio");
                datosDeimos[2] = resultados.getString("Distancia_Media_a_su_Planeta");
                datosDeimos[3] = resultados.getString("Periodo_Orbital");
                datosDeimos[4] = resultados.getString("Temperatura_Media");
                datosDeimos[5] = resultados.getString("Tipo_de_Cuerpo");
                datosDeimos[6] = resultados.getString("Fecha_creacion");

            }
            resultados.close();
            statement.close();
            conexion.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        //return array:
        return datosDeimos;

    }
/**
 * Obtiene los datos del satélite Ío de la base de datos.
 * 
 * @return Un arreglo de strings con los datos del satélite Ío.
 * @exception SQLException Si ocurre un error al realizar la consulta a la base de datos.
 */
    public String[] conectarConsultaÍo() {

        // 1. crear array
        String[] datosÍo = new String[7];
        try {
            // 2. Conectar

            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
            Statement statement = conexion.createStatement();
            // 3. lanzar query:
            ResultSet resultados = statement.executeQuery(sqlÍo);

            // 4. coger datos y guardarlos en el array:
            while (resultados.next()) {
                // Obtener los valores de las columnas
                datosÍo[0] = resultados.getString("Planeta");
                datosÍo[1] = resultados.getString("Radio");
                datosÍo[2] = resultados.getString("Distancia_Media_a_su_Planeta");
                datosÍo[3] = resultados.getString("Periodo_Orbital");
                datosÍo[4] = resultados.getString("Temperatura_Media");
                datosÍo[5] = resultados.getString("Tipo_de_Cuerpo");
                datosÍo[6] = resultados.getString("Fecha_creacion");

            }
            resultados.close();
            statement.close();
            conexion.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        //return array:
        return datosÍo;

    }
    
/**
 * Obtiene los datos del satélite Europa de la base de datos.
 * 
 * @return Un arreglo de strings con los datos del satélite Europa.
 * @exception SQLException Si ocurre un error al realizar la consulta a la base de datos.
 */    
    public String[] conectarConsultaEuropa() {

        // 1. crear array
        String[] datosEuropa = new String[7];
        try {
            // 2. Conectar

            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
            Statement statement = conexion.createStatement();
            // 3. lanzar query:
            ResultSet resultados = statement.executeQuery(sqlEuropa);

            // 4. coger datos y guardarlos en el array:
            while (resultados.next()) {
                // Obtener los valores de las columnas
                datosEuropa[0] = resultados.getString("Planeta");
                datosEuropa[1] = resultados.getString("Radio");
                datosEuropa[2] = resultados.getString("Distancia_Media_a_su_Planeta");
                datosEuropa[3] = resultados.getString("Periodo_Orbital");
                datosEuropa[4] = resultados.getString("Temperatura_Media");
                datosEuropa[5] = resultados.getString("Tipo_de_Cuerpo");
                datosEuropa[6] = resultados.getString("Fecha_creacion");

            }
            resultados.close();
            statement.close();
            conexion.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        //return array:
        return datosEuropa;

    }

    /**
 * Obtiene los datos del satélite Ganimedes de la base de datos.
 * 
 * @return Un arreglo de strings con los datos del satélite Ganimedes.
 * @exception SQLException Si ocurre un error al realizar la consulta a la base de datos.
 */
    public String[] conectarConsultaGanimedes() {

        // 1. crear array
        String[] datosGanimedes = new String[7];
        try {
            // 2. Conectar

            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
            Statement statement = conexion.createStatement();
            // 3. lanzar query:
            ResultSet resultados = statement.executeQuery(sqlGanimedes);

            // 4. coger datos y guardarlos en el array:
            while (resultados.next()) {
                // Obtener los valores de las columnas
                datosGanimedes[0] = resultados.getString("Planeta");
                datosGanimedes[1] = resultados.getString("Radio");
                datosGanimedes[2] = resultados.getString("Distancia_Media_a_su_Planeta");
                datosGanimedes[3] = resultados.getString("Periodo_Orbital");
                datosGanimedes[4] = resultados.getString("Temperatura_Media");
                datosGanimedes[5] = resultados.getString("Tipo_de_Cuerpo");
                datosGanimedes[6] = resultados.getString("Fecha_creacion");

            }
            resultados.close();
            statement.close();
            conexion.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        //return array:
        return datosGanimedes;

    }
 /**
 * Obtiene los datos del satélite Calisto de la base de datos.
 * 
 * @return Un arreglo de strings con los datos del satélite Calisto.
 * @exception SQLException Si ocurre un error al realizar la consulta a la base de datos.
 */   
    public String[] conectarConsultaCalisto() {

        // 1. crear array
        String[] datosCalisto = new String[7];
        try {
            // 2. Conectar

            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
            Statement statement = conexion.createStatement();
            // 3. lanzar query:
            ResultSet resultados = statement.executeQuery(sqlCalisto);

            // 4. coger datos y guardarlos en el array:
            while (resultados.next()) {
                // Obtener los valores de las columnas
                datosCalisto[0] = resultados.getString("Planeta");
                datosCalisto[1] = resultados.getString("Radio");
                datosCalisto[2] = resultados.getString("Distancia_Media_a_su_Planeta");
                datosCalisto[3] = resultados.getString("Periodo_Orbital");
                datosCalisto[4] = resultados.getString("Temperatura_Media");
                datosCalisto[5] = resultados.getString("Tipo_de_Cuerpo");
                datosCalisto[6] = resultados.getString("Fecha_creacion");

            }
            resultados.close();
            statement.close();
            conexion.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        //return array:
        return datosCalisto;

    }
    
/**
 * Obtiene los datos del satélite Titán de la base de datos.
 * 
 * @return Un arreglo de strings con los datos del satélite Titán.
 * @exception SQLException Si ocurre un error al realizar la consulta a la base de datos.
 */    
    public String[] conectarConsultaTitán() {

        // 1. crear array
        String[] datosTitán = new String[7];
        try {
            // 2. Conectar

            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
            Statement statement = conexion.createStatement();
            // 3. lanzar query:
            ResultSet resultados = statement.executeQuery(sqlTitán);

            // 4. coger datos y guardarlos en el array:
            while (resultados.next()) {
                // Obtener los valores de las columnas
                datosTitán[0] = resultados.getString("Planeta");
                datosTitán[1] = resultados.getString("Radio");
                datosTitán[2] = resultados.getString("Distancia_Media_a_su_Planeta");
                datosTitán[3] = resultados.getString("Periodo_Orbital");
                datosTitán[4] = resultados.getString("Temperatura_Media");
                datosTitán[5] = resultados.getString("Tipo_de_Cuerpo");
                datosTitán[6] = resultados.getString("Fecha_creacion");

            }
            resultados.close();
            statement.close();
            conexion.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        //return array:
        return datosTitán;

    }
    
 /**
 * Obtiene los datos del satélite Encélado de la base de datos.
 * 
 * @return Un arreglo de strings con los datos del satélite Encélado.
 * @exception SQLException Si ocurre un error al realizar la consulta a la base de datos.
 */   
    public String[] conectarConsultaEncélado() {

        // 1. crear array
        String[] datosEncélado = new String[7];
        try {
            // 2. Conectar

            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
            Statement statement = conexion.createStatement();
            // 3. lanzar query:
            ResultSet resultados = statement.executeQuery(sqlEncélado);

            // 4. coger datos y guardarlos en el array:
            while (resultados.next()) {
                // Obtener los valores de las columnas
                datosEncélado[0] = resultados.getString("Planeta");
                datosEncélado[1] = resultados.getString("Radio");
                datosEncélado[2] = resultados.getString("Distancia_Media_a_su_Planeta");
                datosEncélado[3] = resultados.getString("Periodo_Orbital");
                datosEncélado[4] = resultados.getString("Temperatura_Media");
                datosEncélado[5] = resultados.getString("Tipo_de_Cuerpo");
                datosEncélado[6] = resultados.getString("Fecha_creacion");

            }
            resultados.close();
            statement.close();
            conexion.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        //return array:
        return datosEncélado;

    }
 
/**
 * Obtiene los datos del satélite Titania de la base de datos.
 * 
 * @return Un arreglo de strings con los datos del satélite Titania.
 *  * @exception SQLException Si ocurre un error al realizar la consulta a la base de datos.
 */   
    public String[] conectarConsultaTitania() {

        // 1. crear array
        String[] datosTitania = new String[7];
        try {
            // 2. Conectar

            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
            Statement statement = conexion.createStatement();
            // 3. lanzar query:
            ResultSet resultados = statement.executeQuery(sqlTitania);

            // 4. coger datos y guardarlos en el array:
            while (resultados.next()) {
                // Obtener los valores de las columnas
                datosTitania[0] = resultados.getString("Planeta");
                datosTitania[1] = resultados.getString("Radio");
                datosTitania[2] = resultados.getString("Distancia_Media_a_su_Planeta");
                datosTitania[3] = resultados.getString("Periodo_Orbital");
                datosTitania[4] = resultados.getString("Temperatura_Media");
                datosTitania[5] = resultados.getString("Tipo_de_Cuerpo");
                datosTitania[6] = resultados.getString("Fecha_creacion");

            }
            resultados.close();
            statement.close();
            conexion.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        //return array:
        return datosTitania;

    }
/**
 * Obtiene los datos del satélite Oberón de la base de datos.
 * 
 * @return Un arreglo de strings con los datos del satélite Oberón.
 * @exception SQLException Si ocurre un error al realizar la consulta a la base de datos.
 */    
    public String[] conectarConsultaOberón() {

        // 1. crear array
        String[] datosOberón = new String[7];
        try {
            // 2. Conectar

            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
            Statement statement = conexion.createStatement();
            // 3. lanzar query:
            ResultSet resultados = statement.executeQuery(sqlOberón);

            // 4. coger datos y guardarlos en el array:
            while (resultados.next()) {
                // Obtener los valores de las columnas
                datosOberón[0] = resultados.getString("Planeta");
                datosOberón[1] = resultados.getString("Radio");
                datosOberón[2] = resultados.getString("Distancia_Media_a_su_Planeta");
                datosOberón[3] = resultados.getString("Periodo_Orbital");
                datosOberón[4] = resultados.getString("Temperatura_Media");
                datosOberón[5] = resultados.getString("Tipo_de_Cuerpo");
                datosOberón[6] = resultados.getString("Fecha_creacion");

            }
            resultados.close();
            statement.close();
            conexion.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        //return array:
        return datosOberón;

    }
    
}
