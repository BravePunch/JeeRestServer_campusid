package services;

import model.dto.UserDto;
import model.dto.mappers.UserDtoMapper;
import model.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositories.IUserRepository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private IUserRepository userRepository;

    private UserDtoMapper dtoMapper;

    public List<UserDto> getAllUsers() {

        Iterator<User> results = userRepository.findAll().iterator();

        List<UserDto> returnData = new ArrayList<>();


        while (results.hasNext()) {

            returnData.add(dtoMapper.mapToDto(results.next()));

        }


        return returnData;
    }

}
