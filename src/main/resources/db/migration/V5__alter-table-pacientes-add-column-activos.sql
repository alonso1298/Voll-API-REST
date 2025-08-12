ALTER TABLE pacientes ADD COLUMN activo TINYINT;
UPDATE pacientes SET activo =1;
ALTER TABLE pacientes MODIFY activo TINYINT NOT NULL;