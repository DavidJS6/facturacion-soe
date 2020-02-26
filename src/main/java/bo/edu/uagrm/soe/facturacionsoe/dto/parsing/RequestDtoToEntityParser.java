package bo.edu.uagrm.soe.facturacionsoe.dto.parsing;

import java.util.List;

public interface RequestDtoToEntityParser<TRequestDto, TEntity> {
    TEntity parseRequestDtoToEntity(TRequestDto dto);

    List<TEntity> parseRequestDtosToEntities(List<TRequestDto> dtos);
}
