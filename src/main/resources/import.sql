INSERT INTO tb_genero (nome_genero) VALUES ('Sertanejo');
INSERT INTO tb_genero (nome_genero) VALUES ('Gospel');

INSERT INTO tb_artistas(nome_artista) VALUES ('Bruno e Marrone');
INSERT INTO tb_artistas(nome_artista) VALUES ('Aline Barros');
INSERT INTO tb_artistas(nome_artista) VALUES ('Padre Marcelo Rossi');

INSERT INTO tb_musicas(nome_musica, genero_id, artista_id) VALUES ('Vida Vazia', 1, 1);
INSERT INTO tb_musicas(nome_musica, genero_id, artista_id) VALUES ('Dormir na Praça', 1, 1);
INSERT INTO tb_musicas(nome_musica, genero_id, artista_id) VALUES ('Sonda-me, Usa-me', 2, 2);
INSERT INTO tb_musicas(nome_musica, genero_id, artista_id) VALUES ('Ressucita-me', 2, 2);

INSERT INTO tb_playlist (nome_playlist, musicas_id) VALUES ('Sertaneja', '1');
INSERT INTO tb_playlist (nome_playlist, musicas_id) VALUES ('Sertaneja', 2);


