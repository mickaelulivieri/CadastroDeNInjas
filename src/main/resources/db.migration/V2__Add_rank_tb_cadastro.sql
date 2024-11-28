-- V2 Migration para add a coluna de ranking na tabela de cadastro

ALTER TABLE tb_Missoes
ADD COLUMN rank VARCHAR(255);
