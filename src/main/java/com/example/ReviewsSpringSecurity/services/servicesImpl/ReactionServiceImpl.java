package com.example.ReviewsSpringSecurity.services.servicesImpl;

//import com.example.ReviewsSpringSecurity.dtos.ReactionDto;
//import com.example.ReviewsSpringSecurity.dtos.ReactionResponseDto;
import com.example.ReviewsSpringSecurity.entities.Reaction;
import com.example.ReviewsSpringSecurity.repositories.ReactionRepository;
import com.example.ReviewsSpringSecurity.services.ReactionInterface;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

//@Service
//public class ReactionServiceImpl implements ReactionInterface {
//    private final ReactionRepository reactionRepository;
//    private final ModelMapper modelMapper;
//    public ReactionServiceImpl(ReactionRepository reactionRepository, ModelMapper modelMapper) {
//        this.reactionRepository = reactionRepository;
//        this.modelMapper = modelMapper;
//    }
//
//    @Override
//    @Transactional
//    public ReactionResponseDto addReaction(ReactionDto reactionDto) {
//            Reaction reaction = modelMapper.map(reactionDto, Reaction.class);
//            Reaction savedReaction = reactionRepository.save(reaction);
//            return modelMapper.map(savedReaction, ReactionResponseDto.class);
//    }
//}
