PROJECT_NAME = meu-projeto

.PHONY: build up down clean

build:
	@docker-compose -p $(PROJECT_NAME) -f docker-compose.yml build

up:
	@docker-compose -p $(PROJECT_NAME) -f docker-compose.yml up -d

down:
	@docker-compose -p $(PROJECT_NAME) -f docker-compose.yml down

clean: down
	@docker-compose -p $(PROJECT_NAME) -f docker-compose.yml rm -f
