package model.dto.mappers;

import model.dto.UserDto;
import model.entity.User;
import org.junit.Assert;
import org.junit.Test;

public class UserDtoMapperTest {

    private UserDtoMapper userDtoMapper = new UserDtoMapper();

    @Test
    public void mapToDto(){

        User source = new User();

        source.setId(1);
        source.setEmail("em@il.com");
        source.setFirstName("JC");
        source.setLastName("DUCE");


        UserDto target = userDtoMapper.mapToDto(source);

        Assert.assertEquals(source.getId(), target.getId());
        Assert.assertEquals(source.getEmail(), target.getEmail());
        Assert.assertEquals(source.getFirstName(), target.getFirstName());
        Assert.assertEquals(source.getLastName(), target.getLastName());

    }

    @Test
    public void mapToEntity(){

        UserDto source = new UserDto();

        source.setId(1);
        source.setEmail("em@il.com");
        source.setFirstName("JC");
        source.setLastName("DUCE");


        User target = userDtoMapper.mapToEntity(source);

        Assert.assertEquals(source.getId(), target.getId());
        Assert.assertEquals(source.getEmail(), target.getEmail());
        Assert.assertEquals(source.getFirstName(), target.getFirstName());
        Assert.assertEquals(source.getLastName(), target.getLastName());

    }

}
