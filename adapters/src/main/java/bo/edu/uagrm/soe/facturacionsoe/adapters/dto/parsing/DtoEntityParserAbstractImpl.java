package bo.edu.uagrm.soe.facturacionsoe.adapters.dto.parsing;

import java.util.LinkedList;
import java.util.List;

public abstract class DtoEntityParserAbstractImpl<TRequestDto, TResponseDto, TEntity>
        implements DtoEntityParser<TRequestDto, TResponseDto, TEntity> {
    public List<TResponseDto> parseEntitiesToResponseDtos(List<TEntity> entities) {
        List<TResponseDto> result = new LinkedList<>();
        for (TEntity originalElement : entities) {
            result.add(parseEntityToResponseDto(originalElement));
        }
        return result;
    }

    public List<TEntity> parseRequestDtosToEntities(List<TRequestDto> dtos) {
        List<TEntity> result = new LinkedList<>();
        for (TRequestDto originalElement : dtos) {
            result.add(parseRequestDtoToCommand(originalElement));
        }
        return result;
    }
}
