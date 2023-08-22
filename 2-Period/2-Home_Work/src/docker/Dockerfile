FROM mysql:8

ENV MYSQL_ROOT_PASSWORD=root123
ENV MYSQL_DATABASE=ifsis
ENV MYSQL_USER=user
ENV MYSQL_PASSWORD=root123


COPY ./scripts/ /docker-entrypoint-initdb.d/
