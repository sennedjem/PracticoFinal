package melomano.dominio

import org.eclipse.xtend.lib.annotations.Accessors

@Accessors
class Cancion {
	String nombre
	String cancionIncompleta
	String primeraPalabra
	String segundaPalabra
	String primeraPregunta
	String segundaPregunta
	String terceraPregunta
	String cuartaPregunta
	String primeraRespuesta
	String segundaRespuesta
	String terceraRespuesta
	String cuartaRespuesta
	String genero
	Integer idCancion
	
	new(String nombre, String canInc, String pripal, String segpal, String primPreg, String segPreg, String terPreg, 
		String cuartaPreg, String primResp, String segResp, String terResp, String cuarResp, String genero){
			this.nombre= nombre
			this.cancionIncompleta = canInc
			this.primeraPalabra = pripal
			this.segundaPalabra = segpal
			this.primeraPregunta = primPreg
			this.segundaPregunta = segPreg
			this.terceraPregunta = terPreg
			this.cuartaPregunta = cuartaPreg
			this.primeraRespuesta = primResp
			this.segundaRespuesta = segResp
			this.terceraRespuesta = terResp 
			this.cuartaRespuesta = cuarResp
			this.genero = genero
		}
		
	def void equals(Cancion cancion){
		this.nombre.equals(cancion.nombre)
	}
		
	
}