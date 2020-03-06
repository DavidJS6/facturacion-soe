package bo.edu.uagrm.soe.facturacionsoe.usecases.dto.parsing;

public interface DtoEntityParser<TRequestDto, TResponseDto, TEntity>
        extends RequestDtoToEntityParser<TRequestDto, TEntity>, EntityToResponseDtoParser<TEntity, TResponseDto> {
}
