package ve.smile.consume.services;

import lights.core.annotations.Consume;
import lights.core.consume.services.IService;
import ve.smile.dto.EventoPlanificado;
import ve.smile.payload.request.PayloadEventoPlanificadoRequest;
import ve.smile.payload.response.PayloadEventoPlanificadoResponse;

@Consume("EventoPlanificadoService")
public class EventoPlanificadoService extends IService<PayloadEventoPlanificadoResponse, PayloadEventoPlanificadoRequest, EventoPlanificado> {

	public PayloadEventoPlanificadoResponse consultaEventoPlanificadoPublicable(Boolean publico, Integer estatusEvento, Long fechaDesde, Integer cant) {
		return doGet(getUrlService("consultaEventoPlanificadoPublicable") + "/" + publico + "/" + estatusEvento + "/" + fechaDesde + "/" + cant);
	}
	
	public PayloadEventoPlanificadoResponse consultaEventoPlanificadoAlbum(Integer album) {
		return doGet(getUrlService("consultaEventoPlanificadoAlbum") + "/" + album);
	}
	
	public PayloadEventoPlanificadoResponse consultaEventosPlanificadosParametrizado(String sql)
	{
		return doGet(getUrlService(new StringBuilder().append("consultaEventosPlanificadosParametrizado").append("/").append(sql).toString()));
	};
}
