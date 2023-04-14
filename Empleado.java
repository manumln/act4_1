/**
 * Esta clase la utilizo para aprender a documentar con javadoc
 * @author Manuel Pablo
 * @version v.0.0
 * 
 */
package ies;

//Atributos de la clase
public class Empleado {
	private int emp_no;
	private String nombre;
	private String apellido;
	private String pobla;
	private String oficio;
	private Double salario;

	/**
	* @param emp_no  Codigo identificador del empleado.
 	* @param nombre  Nombre del empleado.
 	* @param apellido  Apellido del empleado.
 	* @param pobla  Ciudad del emplead.
 	* @param oficio  Oficio del empleado.
 	* @param salario  Salario del empleado.
 	**/
	public Empleado(int emp_no, String nombre, String apellido, String pobla, String oficio,
			Double salario) {
		this.emp_no = emp_no;
		this.nombre = nombre;
		this.apellido = apellido;
		this.pobla = pobla;
		this.oficio = oficio;
		this.salario = salario;
	}
	
	public Empleado(int emp_no, String nombre, Double salario) {
		this.emp_no = emp_no;
		this.nombre = nombre;
		this.salario = salario;
	}

	/**
	 * Retorna el código identificador del empleado.
	 *
	 * @return El codigo identificador del empleado.
	 */
	public int getEmp_no() {
		return emp_no;
	}

	/**
	 * Establece el codigo identificador del empleado.
	 *
	 * @param emp_no
	 */
	public void setEmp_no(int emp_no) {
		this.emp_no = emp_no;
	}
	/**
	 * Retorna el nombre del empleado
	 *
	 * @return Nombre del empleado
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * Introduce el nombre del empleado
	 *
	 * @param nombre  Nombre del empleado
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPobla() {
		return pobla;
	}

	public void setPobla(String pobla) {
		this.pobla = pobla;
	}

	public String getOficio() {
		return oficio;
	}

	public void setOficio(String oficio) {
		this.oficio = oficio;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
	public void subidasalario(Double subida) {
		salario = salario + subida;
	}
	private boolean comprobar(){
		if (nombre.equals("")){
			
			return false;
		}
		return true;
	}
}