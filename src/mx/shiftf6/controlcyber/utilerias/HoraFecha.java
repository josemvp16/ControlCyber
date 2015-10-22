
package mx.shiftf6.controlcyber.utilerias;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Locale;

/**
 *
 * @author Champe
 */
public class HoraFecha {
    
    /** Patrón usado para la conversion */
    private static final String DATE_PATTERN = "yyyy-MM-dd";
    private static final String TIME_PATTERN = "hh:mm:ss";
    
    private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern(DATE_PATTERN);
    private static final DateTimeFormatter TIME_FORMATTER = DateTimeFormatter.ofPattern(TIME_PATTERN);
    
    /**
     * Retorna la fecha introducida en forma de cadena
     * El formato siguiente {@link HoraFecha#DATE_PATTERN} es usado
     * 
     * @param fecha la fecha que será transformada a cadena
     * @return la cadena con formato de fecha
     */
    public static String formatFecha(LocalDate fecha) {
        if (fecha == null) {
            return null;
        }// Fin if
        return DATE_FORMATTER.format(fecha);
    }// Fin método
    
    /**
     * Convierte una cadena en formato de fecha definido {@link FechaHora#DATE_PATTERN}
     *  a un {@link LocalDate} objeto
     * @param fechaCadena la fecha en formato de cadena
     * @return un objeto tipo fecha
     */
    public static LocalDate parseFecha(String fechaCadena) {
        try {
            return DATE_FORMATTER.parse(fechaCadena, LocalDate::from);
        } catch (DateTimeParseException dfpe){
            return null;
        }// Fin try/catch
    }// Fin método
    
    /**
     * Checa si la fecha en formato cadena es valido
     * 
     * @param fechaCadena
     * @return true si la cadena es una fecha valida
     */
    public static boolean validarFecha(String fechaCadena) {
        return HoraFecha.parseFecha(fechaCadena) != null;
    }// Fin método
    
    /**
     * Retorna la hora introducida en forma de cadena
     * El formato siguiente {@link HoraFecha#TIME_PATTERN} es usado
     * 
     * @param hora la fecha que será transformada a cadena
     * @return la cadena con formato de hora
     */
    public static String formatHora(LocalTime hora) {
        if (hora == null) {
            return null;
        }// Fin if
        return TIME_FORMATTER.format(hora);
    }// Fin método
    
    /**
     * Convierte una cadena en formato de hora definido {@link FechaHora#TIME_PATTERN}
     *  a un {@link LocalTime} objeto
     * @param horaCadena la hora en formato de cadena
     * @return un objeto tipo hora
     */
    public static LocalTime parseHora(String horaCadena) {
        try {
            return TIME_FORMATTER.parse(horaCadena, LocalTime::from);
        } catch (DateTimeParseException dfpe){
            return null;
        }// Fin try/catch
    }// Fin método
    
    /**
     * Checa si la hora en formato cadena es valido
     * 
     * @param horaCadena
     * @return true si la cadena es una hora valida
     */
    public static boolean validarHora(String horaCadena) {
        return HoraFecha.parseHora(horaCadena) != null;
    }// Fin método
    
}// Fin clase
