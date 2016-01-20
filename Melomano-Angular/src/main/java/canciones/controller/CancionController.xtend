package canciones.controller


import org.uqbar.xtrest.api.Result
import org.uqbar.xtrest.api.XTRest
import org.uqbar.xtrest.api.annotation.Body
import org.uqbar.xtrest.api.annotation.Controller
import org.uqbar.xtrest.api.annotation.Get
import org.uqbar.xtrest.api.annotation.Post
import org.uqbar.xtrest.http.ContentType
import org.uqbar.xtrest.json.JSONUtils
import java.util.ArrayList
import java.util.List
import melomano.dominio.services.ServicioCancion
import melomano.dominio.Cancion

@Controller
class CancionController {


	var ServicioCancion serv = new ServicioCancion	
	

	extension JSONUtils = new JSONUtils

	@Get('/generos')
	def Result carreras() {
		var generos = #["Rock", "Cumbia","Tango","Pop"]
		response.contentType = ContentType.APPLICATION_JSON
		ok(generos.toJson)
	}

	@Get('/canciones/:genero')
	def Result turnos() {
		var canciones = serv.getPorGenero(genero)
		response.contentType = ContentType.APPLICATION_JSON
		ok(canciones.toJson)
	}

//	@Get("/responder/:mail")
//	def Result responderSiElMailFueUtilizado() {
//		val elMailYaFueUtilizado = repo.elMailYaEsta(mail)
//		response.contentType = ContentType.APPLICATION_JSON
//		if (elMailYaFueUtilizado) {
//			badRequest("{error: 'El mail ya existe.'}")
//		} else {
//			ok(elMailYaFueUtilizado.toJson)
//		}
//	}
//
//	@Post('/mandarRespuesta')
//	def Result responder(@Body String body) {
//		var Respuesta respuesta = body.fromJson(Respuesta)
//		var Encuesta encuesta = respuesta.generarEncuesta(repo);
//		repo.agregarRespuesta(encuesta);
//		ok();
//	}

	def static void main(String[] args) {
		XTRest.start(CancionController, 9800)
		
		
	}
}
