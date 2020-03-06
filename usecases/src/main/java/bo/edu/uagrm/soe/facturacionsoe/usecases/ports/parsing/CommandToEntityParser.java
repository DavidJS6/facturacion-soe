package bo.edu.uagrm.soe.facturacionsoe.usecases.ports.parsing;

import java.util.List;

public interface CommandToEntityParser<TRequestDto, TEntity> {
    TEntity parseCommandToEntity(TRequestDto dto);

    List<TEntity> parseRequestDtosToEntities(List<TRequestDto> dtos);
}
