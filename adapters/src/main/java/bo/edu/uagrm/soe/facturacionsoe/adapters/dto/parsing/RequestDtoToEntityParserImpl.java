package bo.edu.uagrm.soe.facturacionsoe.adapters.dto.parsing;

import java.util.LinkedList;
import java.util.List;

public abstract class RequestDtoToEntityParserImpl<TRequestDto, TEntity>
        implements RequestDtoToEntityParser<TRequestDto, TEntity> {
    public List<TEntity> parseRequestDtosToEntities(List<TRequestDto> dtos) {
        List<TEntity> result = new LinkedList<>();
        for (TRequestDto originalElement : dtos) {
            result.add(parseRequestDtoToCommand(originalElement));
        }
        return result;
    }
}
