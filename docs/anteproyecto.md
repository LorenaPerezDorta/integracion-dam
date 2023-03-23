# Anteproyecto

> NOTA: Incluir diagramas donde proceda (diagramas de clases, casos de uso, entidad relación, ...).

## OBJETIVOS

*El objetivo de este proyecto es desarrollar una aplicación móvil que permita a los usuarios ver las series y películas disponibles en una plataforma de streaming, crear un calendario con las que quieren ver y listas con las películas que están viendo o quieren ver. Esta aplicación será utilizada por los amantes del cine y la televisión que quieran organizar mejor su tiempo de ocio y disfrutar de sus contenidos favoritos.*

## PREANALISIS DE LO EXISTENTE (Opcional)

*Actualmente, los usuarios que quieren ver series y películas en una plataforma de streaming tienen que acceder a la web o a la app de dicha plataforma y buscar entre las opciones disponibles. No hay una forma sencilla de crear un calendario personalizado con las series y películas que se quieren ver ni listas para clasificarlas según su estado (vistas, pendientes, favoritas, etc.). Los usuarios tienen que recurrir a otras aplicaciones externas o a medios tradicionales como agendas o libretas para llevar un control de sus visionados..*

## ANÁLISIS DEL SOFTWARE

*El software que se va a crear es una aplicación móvil compatible con Android e iOS que se conectará con la API de la plataforma de streaming elegida por el usuario (por ejemplo, Netflix) para mostrarle las series y películas disponibles. El software tendrá las siguientes funcionalidades:*

* Permitir al usuario iniciar sesión con su cuenta de la plataforma de streaming.
* Mostrar al usuario las series y películas más populares, recomendadas y novedosas según su perfil.
* Permitir al usuario buscar series y películas por título, género, año o director.
* Mostrar al usuario la información detallada de cada serie o película (sinopsis, reparto, valoración, tráiler).
* Permitir al usuario añadir series o películas a su calendario personalizado indicando la fecha y hora en la que quiere verlas.
* Permitir al usuario crear listas personalizadas con las series o películas que está viendo o quiere ver (vistas, pendientes, favoritas).
* Sincronizar el progreso del usuario en cada serie o película con la plataforma de streaming.
* Enviar notificaciones al usuario cuando haya nuevos episodios disponibles o cuando se acerque la fecha programada para ver una serie o película.

*El software no existía previamente ni se basa en ningún otro software existente.*


## DISEÑO DEL SOFTWARE
* Diseño de la interfaz de usuario: Se diseña la interfaz de usuario de la aplicación utilizando herramientas como Adobe XD o Figma.
* Configuración del entorno de desarrollo: Se instala y configura Android Studio, el IDE oficial para el desarrollo de aplicaciones Android.
* Implementación de la funcionalidad de la lista de seguimiento: Se permite a los usuarios agregar películas y series a una lista de seguimiento utilizando una base de datos SQLite para almacenar la información.
* Implementación del calendario: Se implementa un componente de calendario de Android y se vincula a la base de datos SQLite para recuperar y mostrar la información almacenada.
* Pruebas y depuración: Se realizan pruebas para garantizar que la aplicación funciona correctamente y se solucionan cualquier error o problema de rendimiento que se encuentre.
* Publicación en la tienda de aplicaciones de Android: Se empaqueta y publica la aplicación en la tienda de aplicaciones de Android (Google Play Store).
* Integración con servicios externos: Se integran servicios externos como IMDB o Rotten Tomatoes, para obtener información adicional sobre las películas y series.
* Personalización de la interfaz: Se permite que los usuarios personalicen la interfaz de la aplicación.
* Integración con redes sociales: Se permite que los usuarios compartan información sobre las películas y series que están viendo o que han visto recientemente, y también se permite la conexión con amigos que también usen la aplicación.
* Análisis de datos y mejora continua: Se realiza un análisis de los datos de uso de la aplicación y se recopilan comentarios de los usuarios para identificar áreas de mejora y realizar actualizaciones de la aplicación de manera continua.

*Cabe mencionar que el proceso de desarrollo puede variar dependiendo de los requerimientos específicos de la aplicación y de las herramientas y tecnologías que se utilicen a lo largo del desarrollo de la app.*


## ESTIMACIÓN DE COSTES
*Algunas de las herramientas que mencioné pueden tener un costo asociado. Por ejemplo, Adobe XD es un software de diseño de interfaz de usuario que tiene una versión gratuita, pero también tiene una versión paga con funciones adicionales. Figma también tiene una versión gratuita, pero limitada, y una versión de pago con más características.*

*En cuanto a Android Studio, es un IDE gratuito que se puede descargar e instalar sin costo alguno.*

*En cuanto a la integración con servicios externos como IMDB o Rotten Tomatoes, estos servicios pueden tener una API gratuita con límites de uso, pero también pueden ofrecer planes de pago con más funcionalidades y límites más altos.*

*Es importante tener en cuenta que, dependiendo de las necesidades específicas de la aplicación que vay<n surgiendo a medida que se desarrolla, es posible que se necesiten herramientas o servicios adicionales que tengan un costo asociado. La consideración inicial será solo acogerse a las versiones gratuitas de forma que el coste sea 0. Por otro lado se espera que la producción tenga un tiempo estimado de dos meses y unas 120 horas.*

