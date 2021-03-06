package ve.smile.consume.services;

import lights.core.annotations.Consume;
import lights.core.consume.services.IService;
import ve.smile.dto.Voluntario;
import ve.smile.payload.request.PayloadVoluntarioRequest;
import ve.smile.payload.response.PayloadActividadResponse;
import ve.smile.payload.response.PayloadFortalezaResponse;
import ve.smile.payload.response.PayloadVoluntarioResponse;

@Consume("VoluntarioService")
public class VoluntarioService extends IService<PayloadVoluntarioResponse, PayloadVoluntarioRequest, Voluntario>
{
	public PayloadVoluntarioResponse consultaVoluntariosParametrizado(String sql)
	{
		return doGet(getUrlService(new StringBuilder().append("consultaVoluntariosParametrizado").append("/").append(sql).toString()));
	};
	
	// CAPACITACION PLANIFICADA
	public PayloadVoluntarioResponse consultarPorCapacitacionPlanificada(Integer idCapacitacionPlanificada)
	{
		return doGet(getUrlService(new StringBuilder().append("consultarPorCapacitacionPlanificada").append("/").append(getIdSesion()).append("/").append(getAccessToken()).append("/").append(idCapacitacionPlanificada).toString()));
	};

}
