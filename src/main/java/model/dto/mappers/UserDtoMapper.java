package model.dto.mappers;

import model.dto.UserDto;
import model.entity.User;

public class UserDtoMapper implements IDtoMapper<User, UserDto> {

    @Override
    public UserDto mapToDto(User source) {

        UserDto target = new UserDto();

        target.setId(source.getId());
        target.setEmail(source.getEmail());
        target.setFirstName(source.getFirstName());
        target.setLastName(source.getLastName());

        return target;
    }

    @Override
    public User mapToEntity(UserDto source) {

        User target = new User();

        target.setId(source.getId());
        target.setEmail(source.getEmail());
        target.setFirstName(source.getFirstName());
        target.setLastName(source.getLastName());

        return target;
    }

}
