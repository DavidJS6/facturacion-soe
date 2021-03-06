package bo.edu.uagrm.soe.facturacionsoe.adapters.dto.parsing;

import java.util.List;

public interface EntityToResponseDtoParser<TEntity, TResponseDto> {
    TResponseDto parseEntityToResponseDto(TEntity entity);

    List<TResponseDto> parseEntitiesToResponseDtos(List<TEntity> entities);
}
