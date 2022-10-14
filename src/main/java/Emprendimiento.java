import java.awt.Image;
import java.util.ArrayList;

public class Emprendimiento {
	private String url;
	private String nombre;
	private String descripcion;
	private Image banner;
	private boolean visualizadorManguitos;
	private boolean visualizarDonantes;
	private ArrayList<String> redes;
	private double precioManguito;
	private Emprendedor emprendedor;
	private ArrayList<Posteo> posteo;
	private ArrayList<PlanOfrecido> planesOfrecidos;
	private ArrayList<Donacion> donaciones;
	private ArrayList<Categoria> categorias;
	
	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public Image getBanner() {
		return banner;
	}


	public void setBanner(Image banner) {
		this.banner = banner;
	}


	public boolean isVisualizadorManguitos() {
		return visualizadorManguitos;
	}


	public void setVisualizadorManguitos(boolean visualizadorManguitos) {
		this.visualizadorManguitos = visualizadorManguitos;
	}


	public boolean isVisualizarDonantes() {
		return visualizarDonantes;
	}


	public void setVisualizarDonantes(boolean visualizarDonantes) {
		this.visualizarDonantes = visualizarDonantes;
	}


	public ArrayList<String> getRedes() {
		return redes;
	}


	public void setRedes(ArrayList<String> redes) {
		this.redes = redes;
	}


	public double getPrecioManguito() {
		return precioManguito;
	}


	public void setPrecioManguito(double precioManguito) {
		this.precioManguito = precioManguito;
	}


	public Emprendedor getEmprendedor() {
		return emprendedor;
	}


	public void setEmprendedor(Emprendedor emprendedor) {
		this.emprendedor = emprendedor;
	}


	public ArrayList<Posteo> getPosteo() {
		return posteo;
	}


	public void setPosteo(ArrayList<Posteo> posteo) {
		this.posteo = posteo;
	}


	public ArrayList<PlanOfrecido> getPlanesOfrecidos() {
		return planesOfrecidos;
	}


	public void setPlanesOfrecidos(ArrayList<PlanOfrecido> planesOfrecidos) {
		this.planesOfrecidos = planesOfrecidos;
	}


	public ArrayList<Donacion> getDonaciones() {
		return donaciones;
	}


	public void setDonaciones(ArrayList<Donacion> donaciones) {
		this.donaciones = donaciones;
	}


	public ArrayList<Categoria> getCategorias() {
		return categorias;
	}


	public void setCategorias(ArrayList<Categoria> categorias) {
		this.categorias = categorias;
	}


	public Emprendimiento(String url) {
		this.url= url;
	}
	
	

}
