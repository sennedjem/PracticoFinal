package melomano.dominio.services

import melomano.dominio.hbmUtils.SessionManager
import melomano.dominio.daoHbm.CancionDao
import melomano.dominio.Cancion

class ServicioCancion {
	
	new(){
			var cancion1 = new Cancion("diez años despues","si diez ___ despues te vuelvo a _____  en algun lugar no
te olvides que soy distinto de aquel, pero casi igual","años","encontrar","en que cd se publico esta cancion?",
"en que año?", "como se llama el tema?","a que banda pertenece?","Palabras mas palabras menos","1995","Diez años despues","Los Rodriguez","rock")
	var	cancion2 = new Cancion("Perro amor explota","muy lejos del ___, se enciende otra _____ , y crece en sus ojos,
 como un destello que no te deja dormir","mar","sal","en que cd se publico esta cancion?",
"en que año?", "como se llama el tema?","cual es el nombre completo de la banda a que pertenece?","De la Cabeza","2002","Perro amor explota","Bersuit Vergarabat","rock")
	var	cancion3 = new Cancion("Bajan","Tengo tiempo para saber si lo que ____ concluye en algo,No te apures ya mas,
 loco, porque es entonces cuando las horas___","sueño","bajan","en que cd se publico esta cancion?",
"cual es el apodo del principal integrante de la banda?", "como se llama el tema?","cual es el nombre de la banda a que pertenece?"
,"Artaud","flaco","Bajan","Pescado Rabioso","rock")
this.guardarCancion(cancion1)
this.guardarCancion(cancion2)
this.guardarCancion(cancion3)
	}
	def getPorGenero(String genero){
		SessionManager.runInSession([|
		new CancionDao().getPorGenero(genero.toLowerCase())
		]);
	}
	
	def guardarCancion(Cancion can){
		SessionManager.runInSession([|
		new CancionDao().save(can)
		1
		]);
	}
	
	def eliminarCancion(Cancion can){
		SessionManager.runInSession([|
		new CancionDao().delete(can)
		1
		]);
	}
	
}