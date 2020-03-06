package bo.edu.uagrm.soe.facturacionsoe.usecases.ports.parsing;

import java.util.LinkedList;
import java.util.List;

public abstract class CommandToEntityParserImpl<TRequestDto, TEntity>
        implements CommandToEntityParser<TRequestDto, TEntity> {
    public List<TEntity> parseRequestDtosToEntities(List<TRequestDto> dtos) {
        List<TEntity> result = new LinkedList<>();
        for (TRequestDto originalElement : dtos) {
            result.add(parseCommandToEntity(originalElement));
        }
        return result;
    }
}
